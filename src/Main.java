import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Biblioteca biblioteca = new Biblioteca();
    public static void main() {

        System.out.println("<---Biblioteca--->");

        Scanner input = new Scanner(System.in);


        System.out.println("o que deseja fazer?");
        System.out.println("1. Novo Livro \n2.Novo Cliente \n3.Novo Emprestimo \n4.Devolucao \n5.listar tudo \n6.sair");

        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("<---CADASTRO DE LIVROS--->");
                System.out.println("Digite o nome do livro: ");
                input.nextLine();
                String nomeLivro = input.nextLine();
                System.out.println("Digite a descricao do livro: ");
                String descricao = input.nextLine();
                System.out.println(STR."""
                    nome do livro: \{nomeLivro}\s
                    descricao:\{descricao}""");
                Livro livro = new Livro(nomeLivro, descricao);
                biblioteca.adicionarLivro(livro);
                System.out.println("Livro cadastrado!");
                biblioteca.listaTodosOsLivros();

                break;


            case 2:
                System.out.println("<---CADASTRO DE CLIENTES--->");
                System.out.println("Digite o nome do cliente: ");
                input.nextLine();
                String nomeCliente = input.nextLine();
                System.out.println("Digite cpf do cliente: ");
                String cpfCliente = input.nextLine();
                System.out.println("nome do cliente: " + nomeCliente + "\n cpf:" + cpfCliente);
                Cliente cliente = new Cliente(nomeCliente, cpfCliente, 19);
                biblioteca.adicionarCliente(cliente);
                System.out.println("cliente cadastrado!");
                break;
            case 3:
                if (biblioteca.temLivro()) {
                    System.out.println("<---CADASTRO DE EMPRESTIMOS--->");
                    System.out.println("clientes cadastrados: ");
                    biblioteca.listaClientes();
                    System.out.println("\nnome do cliente que deseja realiza o emprestimo: ");
                    input.nextLine();
                    String nomeClienteEmprestimo = input.nextLine();
                    System.out.println(nomeClienteEmprestimo);
                    if(!biblioteca.clienteEncontrado(nomeClienteEmprestimo)){
                        System.out.println("cliente não cadastrado!");
                        break;
                    }

                    System.out.println("livros cadastrados: ");
                    String todosOsLivros = biblioteca.listaTodosOsLivros();

                    System.out.println("qual livro a ser emprestado?");
                    String nomeLivroEmprestimo = input.nextLine();

                    Emprestimo emprestimo = new Emprestimo(nomeClienteEmprestimo, nomeLivroEmprestimo,todosOsLivros);

                    biblioteca.adicionaEmprestimo(emprestimo);
                    System.out.println("emprestimo realizado com sucesso!");
                }else{
                    System.out.println("sem livros disponíveis :(");
                }
                break;
            case 4:

            case 5:
                System.out.println("LIVROS");
                biblioteca.listaTodosOsLivros();

                System.out.println("\nCLIENTES");
                biblioteca.listaClientes();

                System.out.println("\nAUTORES");
                biblioteca.listaAutores();

                break;
            default:
                System.out.println("por favor insira um numero válido");
                main();
        }

        System.out.println("\nDeseja continuar? \n1.sim \n2.não");
        int continuar = input.nextInt();
        if (continuar == 1) {
            main();
        }

    }
}

