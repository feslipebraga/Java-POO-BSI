package com.mycompany.projetouniversidade;

public class Universidade {
    private String nome;
    private Pessoa pessoa;
    private Departamento departamento;

    public Universidade(Pessoa pessoa, Departamento departamento, String nome) {
        this.pessoa = pessoa;
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "O aluno " + pessoa.getNome() + " trabalha no departamento de " + departamento.getNome() + " na universidade " + this.getNome();
    }
}