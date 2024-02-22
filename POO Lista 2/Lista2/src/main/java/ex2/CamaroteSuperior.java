package ex2;
public class CamaroteSuperior extends VIP {
    private float valorAdicionalCS;

    public CamaroteSuperior(float valorAdicionalCS, float valorAdicionalVIP, float valorIngresso) {
        super(valorAdicionalVIP, valorIngresso);
        this.valorAdicionalCS = valorAdicionalCS;
    }
    
    public void valorCS(){
        float novoValor = this.getValorIngresso() + this.getValorAdicionalVIP() + this.getValorAdicionalCS();
        System.out.printf("Valor do ingresso VIP Cadeira Superior é R$ %.2f%n", novoValor);
    }

    public float getValorAdicionalCS() {
        return valorAdicionalCS;
    }

    public void setValorAdicionalCS(float valorAdicionalCS) {
        this.valorAdicionalCS = valorAdicionalCS;
    }
}
