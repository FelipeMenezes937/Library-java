import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livrosArray = new ArrayList<>();// criando um array de objetos da classe Livro
    private ArrayList<Autor> autoresArray = new ArrayList<>();
    private ArrayList<Cliente> clientesArray = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimosArray = new ArrayList<>();


    public Boolean temLivro(){
        if (livrosArray.isEmpty()){
            return false;
        }
        return true;
    }
    public String listaTodosOsLivros(){


        StringBuilder todosOsLivros = new StringBuilder();
        for (int i = 0; i < livrosArray.size(); i++) {
            Livro livro = livrosArray.get(i);
            System.out.println("\nLivro: " + livro);
            todosOsLivros.append(livro.toString());
        }
        return todosOsLivros.toString();
    }
    public ArrayList listaClientes(){
        for (Cliente cliente : clientesArray) {
            System.out.println("Cliente: " + cliente.nome.toString());
        }
        return clientesArray;
    }

    public void listaAutores(){
        for (Autor autor : autoresArray) {
            System.out.println("Autor: " + autor.nome);
        }
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimosArray.add(emprestimo);
    }

    public boolean verificaSeEmprestimoTemCoisa(){
       return  emprestimosArray.isEmpty() ? false: true;
    }

    public void adicionarLivro(Livro livro){
        livrosArray.add(livro);
    }
    public void adicionarAutor(Autor autor){
        autoresArray.add(autor);
    }
    public void adicionarCliente(Cliente cliente){
        clientesArray.add(cliente);
    }

    public boolean clienteEncontrado(String nomeCliente) {
        for (int i = 0; i < clientesArray.size(); i++) {
            if (nomeCliente.equalsIgnoreCase(clientesArray.get(i).nome)) {
                return true;
            }else {

            }
        }return false;

    }



}
