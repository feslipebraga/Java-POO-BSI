package com.mycompany.ex1;
public class Bola {
    private String cor;
    private float circunferencia;
    private String material;

    public Bola(String cor, float circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void trocaCor(String novaCor){
        this.cor = novaCor;
    }
    
    public String mostraCor(){
        return cor;
    }  
}