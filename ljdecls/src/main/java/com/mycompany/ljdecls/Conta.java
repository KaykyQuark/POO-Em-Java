package com.mycompany.ljdecls;

// Classe Conta
public class Conta {
    private String descricao;
    private double valor;
    private boolean fixa;

    public Conta(String descricao, double valor, boolean fixa) {
        this.descricao = descricao;
        this.valor = valor;
        this.fixa = fixa;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isFixa() {
        return fixa;
    }
}
