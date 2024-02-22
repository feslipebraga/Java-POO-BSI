package college;

public class Universidade {
    private String nome;
    private Pessoa pessoa;
    private Departamento departamento;

    public Universidade(Pessoa pessoa, Departamento departamento, String nome) {
        this.pessoa = pessoa;
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
}