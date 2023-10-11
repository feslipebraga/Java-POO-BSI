package com.mycompany.ex2;
public class Quadrado {
    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }

    public int valorLado() {
        return lado;
    }

    public void mudarLado(int lado) {
        this.lado = lado;
    }
    
    public int area(){
        int calculo = this.lado*this.lado;
        return calculo;
    }
}