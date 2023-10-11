package ex3;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(int matricula, String nome, String endereco, int telefone, String email) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
}