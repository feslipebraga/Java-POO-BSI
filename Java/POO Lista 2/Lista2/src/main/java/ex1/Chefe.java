package ex1;
public class Chefe extends Empregado {
    private float beneficio;

    public Chefe(float beneficio, int codigo, String nome, String email, float salario) {
        super(codigo, nome, email, salario);
        this.beneficio = beneficio;
    }
    
    public void aumentoSalarial(float percentual) {
        float novoSalario = (this.getSalario() * percentual/100) + this.getSalario();
        novoSalario = novoSalario + this.beneficio;
        this.setSalario(novoSalario);
    }
}
