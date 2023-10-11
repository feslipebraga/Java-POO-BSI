package ex1;
public class Empregado {
    private int codigo;
    private String nome;
    private String email;
    private float salario;

    public Empregado(int codigo, String nome, String email, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public void aumentoSalarial(float percentual) {
        float novoSalario = (this.salario * percentual/100) + this.salario;
        this.salario = novoSalario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
    }
}
