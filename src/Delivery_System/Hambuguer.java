package Delivery_System;

public class Hambuguer extends Produto{

    public Hambuguer(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void inserirNoPedido() {
        System.out.println("Hambuguer de " + getNome() + " inserido com sucesso!");
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
