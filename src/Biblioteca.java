import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livrosArray = new ArrayList<>();// criando um array de objetos da classe Livro
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();


    public Boolean temLivro(){
        if (livrosArray.isEmpty()){
            return false;
        }
        return true;
    }
    public void listaTodosOsLivros(){
        for (int i = 0; i < livrosArray.size(); i++) {
            Livro livro = livrosArray.get(i);
            System.out.println(livro.titulo);
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

    public void adicionarLivro(Livro livro){
        livrosArray.add(livro);
    }
}
