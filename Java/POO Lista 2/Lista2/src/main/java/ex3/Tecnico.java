package ex3;

public class Tecnico extends Assistente {
    private float bonusSalarial;

    public Tecnico(int matricula, String nome, String endereco, int telefone, String email, float bonusSalarial) {
        super(matricula, nome, endereco, telefone, email);
        this.bonusSalarial = bonusSalarial;
    }
}