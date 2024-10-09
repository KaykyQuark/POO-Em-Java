package com.mycompany.ljdecls;

/**
 *
 * @author kayky
 */
import java.util.ArrayList;

// Classe Loja
public class Loja {
    private ArrayList<Produto> produtos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Manutencao> manutencoes;
    private ArrayList<Conta> contas;

    public Loja() {
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.manutencoes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    // Criar/adicionar métodos
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void adicionarManutencao(Manutencao manutencao) {
        this.manutencoes.add(manutencao);
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // Alterar métodos
    public void alterarProduto(Produto produto, String novoNome, double novoPrecoVenda) {
        produto.setNome(novoNome);
        produto.setPrecoVenda(novoPrecoVenda);
    }

    public void alterarCliente(Cliente cliente, String novoNome) {
        cliente.nome = novoNome;
    }

    public void alterarFuncionario(Funcionario funcionario, String novaFuncao, double novoSalario) {
        funcionario.funcao = novaFuncao;
        funcionario.salario = novoSalario;
    }

    // Excluir métodos
    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public void removerCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    // Mostrar listas (para visualização)
    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - " + p.getQuantidade() + " unidades");
        }
    }

    public static void main(String[] args) {
        // Instanciar a loja
        Loja loja = new Loja();

        // Instanciar produtos
        Produto produto1 = new Produto("Celular", 2000, 2500, 10);
        Produto produto2 = new Produto("Mouse", 50, 80, 50);

        // Adicionar produtos à loja
        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);

        // Alterar o produto 1 (Notebook)
        loja.alterarProduto(produto1, "Celular Iphone", 3000);

        // Excluir o produto 2 (Mouse)
        loja.removerProduto(produto2);

        // Listar os produtos
        loja.listarProdutos();  // Apenas o "Notebook Gamer" deve aparecer

        System.out.println("Sistema da loja foi atualizado com sucesso!");
    }
}
