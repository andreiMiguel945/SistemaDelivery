package Delivery_System;

import Delivery_System.GerenciamentoEntrega.GerenciadorEntrega;
import Delivery_System.GerenciamentoEntrega.GerenciamentoEntrega;
import Delivery_System.Notificacao.Notificacao;
import Delivery_System.Notificacao.Whatsapp;
import Delivery_System.Pagamento.Pagamento;
import Delivery_System.Pagamento.PagamentoCartao;
import Delivery_System.Pedido.GerenciadorPedido;
import Delivery_System.Produto.Pizza;
import Delivery_System.Produto.Produto;


public class Main {

    public static void main(String[] args) {

        GerenciadorPedido gp = new GerenciadorPedido();

        Produto produto1 = new Pizza("Calabresa", 45.00);

        Notificacao notificacao = new Whatsapp("43 9988-444555");

        Pagamento pagamento = new PagamentoCartao("Debito", 45.00);

        gp.criarPedido("pedido1", "AOBA", notificacao, produto1);

        gp.enviarNotificacao(1, "Seu pedido foi recebido!");

        gp.efetuarPagamento(1, pagamento, 45.00);

        GerenciamentoEntrega ge = new GerenciadorEntrega(gp);

        ge.criarEntrega(1, "Rua das Flores, 123");

        ge.atribuirEntregador(1, "Carlos");

        ge.atualizarStatus(1, "Saiu para entrega");

        ge.consultarEntrega(1);

        ge.atualizarStatus(1, "Entregue");
    }
}