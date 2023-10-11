package com.mycompany.ex6;

public class bombaCombustivel {
    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public bombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    public void abastecerPorValor(float valorAbastecido){
        float valor = valorAbastecido / this.valorLitro;
        String auxiliar1 = String.format("%.2f", valorAbastecido);
        String auxiliar2 = String.format("%.2f", valor);
        System.out.println("--- ABASTECENDO POR VALOR ---");
        System.out.println("R$" + auxiliar1);
        System.out.println("LITROS: " + auxiliar2);
        this.alterarQuantidadeCombustivel(valor);
        // método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
    }
    
    public void abastecerPorLitro(float litroAbastecido) {
        float dinheiro = litroAbastecido * this.valorLitro;
        String auxiliar1 = String.format("%.2f", litroAbastecido);
        String auxiliar2 = String.format("%.2f", dinheiro);
        System.out.println("--- ABASTECENDO POR LITRO ---");
        System.out.println("LITROS: " + auxiliar1);
        System.out.println("R$: " + auxiliar2);
        this.alterarQuantidadeCombustivel(litroAbastecido);
        // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
    }

    public void alterarCombustivel(String tipoCombustivel) {
        System.out.println("--- COMBUSTÍVEL ALTERADO ---");
        this.tipoCombustivel = tipoCombustivel;
    }

    public void alterarValor(float valorLitro) {
        System.out.println("--- VALOR ALTERADO ---");
        this.valorLitro = valorLitro;
    }
    
    public void alterarQuantidadeCombustivel(float quantidadeComb) {
        float novaQuantidade = this.quantidadeCombustivel - quantidadeComb;
        this.quantidadeCombustivel = novaQuantidade;
        // OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba.
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    
    @Override
    public String toString(){
        String vlrLitro = String.format("%.2f", this.getValorLitro());
        String qtdComb = String.format("%.2f", this.getQuantidadeCombustivel());
        return "[Combustível: " + this.tipoCombustivel + "; Valor: R$" + vlrLitro + "; Quantidade: " + qtdComb + "]";
    }
}