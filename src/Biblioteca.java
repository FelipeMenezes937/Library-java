import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();// criando um array de objetos da classe Livro
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();


    public Boolean temLivro(){
        if (livros.isEmpty()){
            return false;
        }
        return true;
    }
    public void listaTodosOsLivros(){
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro + "\n disponível?" +livro.disponivel);
        }
    }
    public void listaClientes(){
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.nome);
        }
    }

    public void listaAutores(){
        for (Autor autor : autores) {
            System.out.println("Autor: " + autor.nome);
        }
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public boolean verificaSeEmprestimoTemCoisa(){
       return  emprestimos.isEmpty() ? false: true;
    }
}
