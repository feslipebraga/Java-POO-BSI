package ex2;
public class Ingresso {
    private float valorIngresso;

    public Ingresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public void ImprimeValor(){
        System.out.printf("O valor do ingresso é R$ %.2f%n", this.valorIngresso);
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    
}