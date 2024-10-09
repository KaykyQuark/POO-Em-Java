package com.mycompany.ljdecls;

// Classe Produto 
public class Produto {
    private String nome;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;

    public Produto(String nome, double precoCompra, double precoVenda, int quantidade) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
    }

    public double calcularMargemLucro() {
        return this.precoVenda - this.precoCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void removerProduto() {
        this.nome = null;
        this.precoCompra = 0;
        this.precoVenda = 0;
        this.quantidade = 0;
    }
}