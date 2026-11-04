package Delivery_System;

import java.util.ArrayList;

public class GerenciadorPedido {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private int contador = 0;

    public void criarPedido(String descricao, String cliente, double valor) {
        contador++;

        Pedido pedido = new Pedido(contador, descricao, cliente, valor, false);

        pedidos.add(pedido);

        System.out.println("Pedido criado!");
    }

    public void exibirPedido(int codigo) {

        for (Pedido p : pedidos) {
            if (p.getCodigo() == codigo) {
                System.out.println(
                        p.getDescricao() + " - " +
                                p.getCliente() + " - " +
                                p.getValor()
                );
                return;
            }
        }

        System.out.println("Pedido não encontrado!");
    }
}