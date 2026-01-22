import java.util.Date;

public class Emprestimo {
    int id = 0;
    String nomeCliente;
    Object Livro;
    Date dataEmprestimo;
    Date dataDevolucao;

    public Emprestimo(String nomeDoCliente, String nomeLivro, String todosOsLivros) {


        if(todosOsLivros.contains(nomeLivro)) {
            this.id = this.id+1;
            this.nomeCliente =  nomeDoCliente;
            System.out.println("Emprestimo criado com sucesso! id: "+ this.id);

            this.Livro = Livro;
            this.dataEmprestimo = new Date();

        }else{
            System.out.println("Livro já foi emprestado! ou indisponível :(");
        }

    }

//    public void devolver(Date  dataDevolucao, Object Livro, String nomeDoCliente) {
//
//        if(Livro instanceof Livro && ((Livro) Livro).disponivel == false){
//            ((Livro) Livro).mudaDisponivel(true);
//        }else{
//            System.out.println("livro não foi emprestado! :)");
//        }
//    }


}
