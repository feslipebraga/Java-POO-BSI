package com.mycompany.ex5;

// Fome e saúde mímina e máxima para um Tamagushi será de 0 e 10, respectivamente.
public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtual(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }
    
    public void humor() {
        if (fome < 0 || fome > 10 || saude < 0 || saude > 10) {
            System.out.println("ERRO -- Valores atribuídos para fome e/ou saúde inválidos.");
        } else if (fome <= 5 && saude >= 7) {
            System.out.println("HUMOR: " + this.getNome() + " está feliz");
        } else if (fome > 5 && saude >= 7) {
            System.out.println("HUMOR: " + this.getNome() + " está faminto");
        } else if (fome <= 5 && saude < 7) {
            System.out.println("HUMOR: " + this.getNome() + " está doente");
        } else if (fome > 5 && saude < 7) {
            System.out.println("HUMOR: " + this.getNome() + " está triste");
        } else {
            System.out.println("ERRO");
        }
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Fome: " + this.getFome());
        System.out.println("Saúde: " + this.getSaude());
        this.humor();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
