package com.mycompany.ex2;
public class Ex2 {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado(3);
        quad.mudarLado(5);
        System.out.println("Valor do lado: " + quad.valorLado());
        System.out.println("Valor da Área: " + quad.area());
    }
}
