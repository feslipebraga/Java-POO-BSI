package com.mycompany.projetouniversidade;

public class Main {
    public static void main(String[] args) {  
        Departamento d1 = new Departamento("Física");
        Departamento d2 = new Departamento("Matemática");
        
        Pessoa albert = new Pessoa("Albert Einsten", d1);
        Pessoa isaac = new Pessoa("Isaac Newton", d2);
        
        Universidade u1 = new Universidade(albert, d1, "Princeton");
        Universidade u2 = new Universidade(isaac, d2, "Cambridge");
        
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
