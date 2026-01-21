import java.util.ArrayList;
import java.util.Date;

public class Livro {
    int id;
    String titulo;
    private static ArrayList<Livro> todosLivros = new ArrayList<>();
    String descricao;
    Boolean disponivel;
    Date dataCadastro;
    Date dataAtualizacao;

    public Livro(String titulo, String descricao) {
        this.id +=1 ;
        this.titulo = titulo;
        this.descricao = descricao;
        this.disponivel = true; // por padrão inicia em true
        this.dataCadastro = new Date();//pega a data no memento em que instanciamos
        this.dataAtualizacao = new Date();
        todosLivros.add(this);
    }

    boolean verificaDisponivel() {
        if (this.disponivel == true) {
            return true;
        } else {
            return false;
        }

    }
    // mudando a disponibilidade apartir dos emprestimos
    void mudaDisponivel(String condicao) {
        if (condicao == "emprestei") {
            this.disponivel = false;
        } else {
            this.disponivel = true;
        }
    }


}