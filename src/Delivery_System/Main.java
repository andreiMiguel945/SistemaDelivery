package Delivery_System;

public class Main {
    public static void main(String[] args) {

        GerenciadorPedido gp = new GerenciadorPedido();

        gp.criarPedido("Pedido 1","Pedro",5);
        gp.criarPedido("Pedido 2","Augusto",7);
        gp.exibirPedido(1);
        gp.exibirPedido(2);
        gp.efetuarPagamento(1,"Credito", 4);

    }
}
