import java.util.Date;

public class Autor {
    int  id = 0;
    String nome;
    String dtNascimento;

    public Autor(int id, String nome, String dtNascimento) {
        this.id += 1;
        this.nome = nome;
        this.dtNascimento = dtNascimento;

    }
}
