package Delivery_System.GerenciamentoEntrega;


import Delivery_System.Pedido.GerenciadorPedido;
import Delivery_System.Pedido.Pedido;

import java.util.ArrayList;

public class GerenciadorEntrega implements GerenciamentoEntrega {

    private ArrayList<Entrega> entregas = new ArrayList<>();
    private GerenciadorPedido gerenciadorPedido;

    public GerenciadorEntrega(GerenciadorPedido gerenciadorPedido) {
        this.gerenciadorPedido = gerenciadorPedido;
    }

    @Override
    public void criarEntrega(int codigoPedido, String endereco) {

        Pedido pedidoEncontrado = null;

        for (Pedido p : gerenciadorPedido.obterPedidos()) {

            if (p.getCodigo() == codigoPedido) {
                pedidoEncontrado = p;
                break;
            }
        }

        if (pedidoEncontrado == null) {
            System.out.println("Pedido não encontrado! Não foi possível criar a entrega.");
            return;
        }

        for (Entrega e : entregas) {

            if (e.getPedido().getCodigo() == codigoPedido) {
                System.out.println("Esse pedido já possui uma entrega cadastrada!");
                return;
            }
        }

        Entrega entrega = new Entrega(pedidoEncontrado, endereco);

        entregas.add(entrega);

        System.out.println("\nEntrega cadastrada com sucesso!");
        System.out.println("Código do pedido: " + codigoPedido);
        System.out.println("Endereço: " + endereco);
        System.out.println("Status: Aguardando entrega");
    }

    @Override
    public void atribuirEntregador(int codigoPedido, String entregador) {

        for (Entrega e : entregas) {

            if (e.getPedido().getCodigo() == codigoPedido) {

                e.setEntregador(entregador);

                System.out.println("\nEntregador atribuído com sucesso!");
                System.out.println("Pedido: " + codigoPedido);
                System.out.println("Entregador: " + entregador);

                return;
            }
        }

        System.out.println("Entrega não encontrada!");
    }

    @Override
    public void atualizarStatus(int codigoPedido, String status) {

        for (Entrega e : entregas) {

            if (e.getPedido().getCodigo() == codigoPedido) {

                e.setStatus(status);

                System.out.println("\nStatus da entrega atualizado!");
                System.out.println("Pedido: " + codigoPedido);
                System.out.println("Novo status: " + status);

                return;
            }
        }

        System.out.println("Entrega não encontrada!");
    }

    @Override
    public void consultarEntrega(int codigoPedido) {

        for (Entrega e : entregas) {

            if (e.getPedido().getCodigo() == codigoPedido) {

                System.out.println("\n========== DADOS DA ENTREGA ==========");
                System.out.println("Código do pedido: " + e.getPedido().getCodigo());
                System.out.println("Cliente: " + e.getPedido().getCliente());
                System.out.println("Descrição: " + e.getPedido().getDescricao());
                System.out.println("Endereço: " + e.getEndereco());
                System.out.println("Entregador: " + e.getEntregador());
                System.out.println("Status: " + e.getStatus());
                System.out.println("======================================");

                return;
            }
        }

        System.out.println("Entrega não encontrada!");
    }
}