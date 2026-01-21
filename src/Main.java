import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main() {

        System.out.println("<---Biblioteca--->");
        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);


        System.out.println("o que deseja fazer?");
        System.out.println("1. Novo Livro \n2.Novo Cliente \n3.Novo Emprestimo \n4.Devolucao \n5.listar tudo \n 6.sair");

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
                System.out.println("Livro cadastrado!");

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
                System.out.println("cliente cadastrado!");
                break;
            case 3:
                if (biblioteca.temLivro()) {
                    System.out.println("<---CADASTRO DE EMPRESTIMOS--->");
                    System.out.println("nome do cliente que deseja realiza o emprestimo: ");
                    String nomeClienteEmprestimo = input.nextLine();
                    System.out.println("qual livro a ser emprestado?");
                    biblioteca.listaTodosOsLivros();
                    String nomeLivroEmprestimo = input.nextLine();
                    Emprestimo emprestimo = new Emprestimo(nomeClienteEmprestimo, nomeLivroEmprestimo);
                    break;
                }else{
                    System.out.println("sem livros disponíveis :(");
                    break;
                }
            case 4:
                if (biblioteca.verificaSeEmprestimoTemCoisa()){

                }
            case 5:
                System.out.println("LIVROS");
                livro.listaLivros();

                System.out.println("CLIENTES");
                biblioteca.listaClientes();

                System.out.println("AUTORES");
                biblioteca.listaAutores();

                break;

        }

        System.out.println("Deseja continuar? 1.sim \n 2.não");
        int continuar = input.nextInt();
        if (continuar == 1) {
            main();
        }

    }
}

