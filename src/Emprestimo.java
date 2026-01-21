import java.util.Date;

public class Emprestimo {
    int id = 0;
    String nomeCliente;
    Object Livro;
    Date dataEmprestimo;
    Date dataDevolucao;

    public Emprestimo(String nomeDoCliente, Object Livro) {


        if(Livro instanceof Livro && ((Livro) Livro).disponivel == true){
            this.id = this.id+1;
            this.nomeCliente =  nomeDoCliente;
            System.out.println("Emprestimo criado com sucesso! id: "+ this.id);
            ((Livro) Livro).mudaDisponivel("emprestei");
            this.Livro = Livro;
            this.dataEmprestimo = new Date();

        }else{
            System.out.println("Livro já foi emprestado! :(");
        }

    }

    public void devolver(Date  dataDevolucao, Object Livro, String nomeDoCliente) {

        if(Livro instanceof Livro && ((Livro) Livro).disponivel == false){
            ((Livro) Livro).mudaDisponivel("devolver");
        }else{
            System.out.println("livro não foi emprestado! :)");
        }
    }
}
