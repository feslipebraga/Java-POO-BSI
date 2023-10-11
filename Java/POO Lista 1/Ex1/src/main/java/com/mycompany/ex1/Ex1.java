package com.mycompany.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Bola minhaBola = new Bola("Azul", 0.7f, "Borracha");
        minhaBola.trocaCor("Preto");
        System.out.println("Cor da Bola: " + minhaBola.mostraCor());
    }
}