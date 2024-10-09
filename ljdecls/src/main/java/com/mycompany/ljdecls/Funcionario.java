package com.mycompany.ljdecls;

// Classe Funcionário
public class Funcionario {
    private String nome;
    private String funcao;
    private double salario;

    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }
}
