package Delivery_System;

public abstract class Produto {

    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public abstract void inserirNoPedido();


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}

