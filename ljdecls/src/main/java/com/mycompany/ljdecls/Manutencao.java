package com.mycompany.ljdecls;

// Classe Manutenção
public class Manutencao {
    private String descricao;
    private double valorPecas;
    private double maoDeObra;

    public Manutencao(String descricao, double valorPecas, double maoDeObra) {
        this.descricao = descricao;
        this.valorPecas = valorPecas;
        this.maoDeObra = maoDeObra;
    }

    public double calcularValorTotal() {
        return this.valorPecas + this.maoDeObra;
    }

    public String getDescricao() {
        return descricao;
    }
}