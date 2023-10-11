package ex3;

public class Funcionario {
    private String nome;
    private String endereco;
    private int telefone;
    private String email;

    public Funcionario(String nome, String endereco, int telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}