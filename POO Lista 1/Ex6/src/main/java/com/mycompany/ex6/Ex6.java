package com.mycompany.ex6;

public class Ex6 {

    public static void main(String[] args) {
        bombaCombustivel bomba = new bombaCombustivel("Gasolina", 5.8f, 100);
        System.out.println(bomba.toString());

        bomba.abastecerPorValor(90);
        System.out.println(bomba.toString());
        
        bomba.alterarValor(6.9f);
        System.out.println(bomba.toString());
        
        bomba.abastecerPorLitro(25);
        System.out.println(bomba.toString());
    }
}