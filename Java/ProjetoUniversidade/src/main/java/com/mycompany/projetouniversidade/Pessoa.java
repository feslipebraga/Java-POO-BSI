package com.mycompany.projetouniversidade;

public class Pessoa {
    private String nome;
    private Departamento departamento;

    public Pessoa(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
