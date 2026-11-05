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
                System.out.println(p.getDescricao() + " - " + p.getCliente() + " - " + p.getValor());
                return;
            }
        }

        System.out.println("Pedido não encontrado!");
    }

    public void efetuarPagamento(int codigo, String metodoPagamento, double valorInserido) {
        double precoPedido = 0;
        boolean resultado = false;
        for (Pedido p : pedidos) {
            if (p.getCodigo() == codigo) {
                precoPedido = p.getValor();
                if(metodoPagamento.equals("Credito")){
                    PagamentoCartao cartao = new PagamentoCartao("Credito",precoPedido);
                    resultado = cartao.Pagar(valorInserido);
                }else if(metodoPagamento.equals("Debito")){
                    PagamentoCartao cartao = new PagamentoCartao("Debito", precoPedido);
                    resultado = cartao.Pagar(precoPedido);
                }else if(metodoPagamento.equals("Pix")){
                    PagamentoPix pix = new PagamentoPix(precoPedido);
                    resultado = pix.Pagar(precoPedido);
                }else if(metodoPagamento.equals("Dinheiro")){}
                if(resultado){
                    p.setPago(true);
                }
                break;
            }
        }
    }
}