public class Cliente {
    String nome;
    String cpf;
    int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    @Override
    public String toString(){
        return nome;
    }


}
