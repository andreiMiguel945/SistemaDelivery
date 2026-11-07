package Delivery_System;

import Delivery_System.Notificacao.Notificacao;
import Delivery_System.Notificacao.Whatsapp;
import Delivery_System.Pagamento.Pagamento;
import Delivery_System.Pagamento.PagamentoCartao;
import Delivery_System.Produto.Pizza;
import Delivery_System.Produto.Produto;

public class Main {
    public static void main(String[] args) {

        // Instanciando o gerenciador
        GerenciadorPedido gp = new GerenciadorPedido();

        // Criando o produto
        Produto produto1 = new Pizza("Calabresa", 45.00);

        // Definindo o meio de notificação
        Notificacao notificacao = new Whatsapp("43 9988-444555");

        // Definindo a forma de pagamento
        Pagamento pagamento = new PagamentoCartao("Debito", 45.00);

        // Criando o pedido
        gp.criarPedido("pedido1", "AOBA", notificacao, produto1);

        // Enviando notificação
        gp.enviarNotificacao(1, "Seu pedido foi recebido!");

        // Efetuando pagamento
        gp.efetuarPagamento(1, pagamento, 45.00);
    }
}