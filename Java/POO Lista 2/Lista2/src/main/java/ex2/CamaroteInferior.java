package ex2;

public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(String localizacao, float valorAdicionalVIP, float valorIngresso) {
        super(valorAdicionalVIP, valorIngresso);
        this.localizacao = localizacao;
    }
    
    public void imprimeLocalizacao(){
        System.out.println("A localização do assento é: CAMAROTE INFERIOR - " + this.getLocalizacao());
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
