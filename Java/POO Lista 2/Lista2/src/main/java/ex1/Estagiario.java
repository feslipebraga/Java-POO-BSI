package ex1;
public class Estagiario extends Empregado {
    private int descontos;
    
    public Estagiario(int descontos, int codigo, String nome, String email, float salario){
        super(codigo, nome, email, salario);
        this.descontos = descontos;
    }
    
    public void aumentoSalarial(float percentual) {
        float novoSalario = (this.getSalario() * percentual/100) + this.getSalario();
        novoSalario = novoSalario - this.descontos;
        this.setSalario(novoSalario);
    }
}
