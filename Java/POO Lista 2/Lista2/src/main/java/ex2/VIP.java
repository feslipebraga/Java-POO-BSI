package ex2;
public class VIP extends Ingresso {
    private float valorAdicionalVIP;

    public VIP(float valorAdicionalVIP, float valorIngresso) {
        super(valorIngresso);
        this.valorAdicionalVIP = valorAdicionalVIP;
    }
    
    public void valorVIP(){
        float novoValor = this.getValorIngresso() + this.getValorAdicionalVIP();
        System.out.printf("Valor do ingresso VIP é R$ %.2f%n", novoValor);
    }

    public float getValorAdicionalVIP() {
        return valorAdicionalVIP;
    }

    public void setValorAdicionalVIP(float valorAdicionalVIP) {
        this.valorAdicionalVIP = valorAdicionalVIP;
    }
    
    
}
