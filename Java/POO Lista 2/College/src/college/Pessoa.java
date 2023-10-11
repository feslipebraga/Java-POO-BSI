package college;
public class Pessoa {
    private String nome;
    private Departamento departamento;

    public Pessoa(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
}