package Delivery_System;

import java.util.List;

public class RelatorioPedido implements GeracaoRelatorio {
    private List<Pedido> pedidos;

    public RelatorioPedido(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void gerarRelatorio() {
            int totalPedidos = pedidos.size();
            int pedidosPagos = 0;
            int pedidosPendentes = 0;

            double valorTotal = 0;
            double valorArrecadado = 0;

            System.out.println("\n========== RELATÓRIO DE PEDIDOS ==========");

            for (Pedido p : pedidos) {

                System.out.println("\nCódigo: " + p.getCodigo());
                System.out.println("Descrição: " + p.getDescricao());
                System.out.println("Cliente: " + p.getCliente());
                System.out.println("Valor: R$ " + p.getValor());

                valorTotal += p.getValor();

                if (p.isPago()) {
                    pedidosPagos++;
                    valorArrecadado += p.getValor();
                    System.out.println("Status: PAGO");
                } else {
                    pedidosPendentes++;
                    System.out.println("Status: PENDENTE");
                }
            }

            System.out.println("\n========== RESUMO ==========");
            System.out.println("Total de pedidos: " + totalPedidos);
            System.out.println("Pedidos pagos: " + pedidosPagos);
            System.out.println("Pedidos pendentes: " + pedidosPendentes);
            System.out.println("Valor total: R$ " + valorTotal);
            System.out.println("Valor arrecadado: R$ " + valorArrecadado);

            System.out.println("=========================================");
    }
}

