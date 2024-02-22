package ex3;

public class Administrativo extends Assistente {
    private String turno;
    private float adicionalNoturno;

    public Administrativo(int matricula, String nome, String endereco, int telefone, String email, String turno, float adicionalNoturno) {
        super(matricula, nome, endereco, telefone, email);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }
    
}