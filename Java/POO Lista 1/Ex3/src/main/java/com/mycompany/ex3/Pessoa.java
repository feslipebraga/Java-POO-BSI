package com.mycompany.ex3;
public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void envelhecer(){
        this.idade++;
        if (this.idade < 21){
            crescer(0.05f);
        }
    }
    
    public void engordar(float aumentar){
        this.peso += aumentar;
        
    }
    public void emagrecer(float diminuir){
        this.peso -= diminuir;
        
    }
    public void crescer(float aumentar){
        this.altura += aumentar;
        
    }

    @Override
    public String toString(){
        return "Nome = " + getNome() + ", Idade = " + getIdade() + ", Peso = " + getPeso() + ", Altura = " + getAltura();
    }
}