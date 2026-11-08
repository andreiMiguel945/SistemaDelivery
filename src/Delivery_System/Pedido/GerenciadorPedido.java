package Delivery_System.Pedido;


import Delivery_System.Notificacao.Notificacao;
import Delivery_System.Produto.Produto;
import Delivery_System.Pagamento.Pagamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorPedido implements GerenciamentoPedido {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private int contador = 0;

    @Override
    public void criarPedido(String descricao, String cliente, Notificacao meioDeComunicao, Produto produto) {
        contador++;

        Pedido pedido = new Pedido(contador, descricao + " - " + produto.getNome(), cliente, meioDeComunicao, produto.getPreco(), false);

        pedidos.add(pedido);

        produto.inserirNoPedido();

        System.out.println("Pedido criado!");
    }

    public void adicionarProduto(int codigo, Produto produto) {
        for(Pedido p : pedidos) {
            if(p.getCodigo() == codigo) {
                double novoValor = p.getValor() + produto.getPreco();
                p.setValor(novoValor);

                p.setDescricao(p.getDescricao() + " - " + produto.getNome());

                produto.inserirNoPedido();

                System.out.println("Produto adicionado ao pedido " + p.getCodigo() + "!");
                System.out.println("Novo valor: R$" + p.getValor());

                return;
            }
        }
        System.out.println("Pedido não encontrado!");
    }
    @Override
    public void exibirPedido(int codigo) {

        for (Pedido p : pedidos) {
            if (p.getCodigo() == codigo) {
                System.out.println(p.getDescricao() + " - " + p.getCliente() + " - " + p.getValor());
                System.out.println("Pedido pago: " + p.isPago());
                return;
            }
        }

        System.out.println("Pedido não encontrado!");
    }

    public boolean efetuarPagamento(int codigo, Pagamento pagamento, double valorInserido) {

        for (Pedido p : pedidos) {

            if (p.getCodigo() == codigo) {

                if (p.isPago()) {
                    System.out.println("Pedido já foi pago!");
                    return false;
                }

                boolean resultado = pagamento.Pagar(valorInserido);

                if (resultado) {
                    p.setPago(true);
                    System.out.println("Pedido atualizado: PAGO!");
                }

                return resultado;
            }
        }

        System.out.println("Pedido não encontrado!");
        return false;
    }
    @Override
    public void enviarNotificacao(int codigo, String mensagem){
        for(Pedido p : pedidos) {
            if(p.getCodigo() == codigo) {
                p.enviarNotificacao(mensagem);
                return;
            }
        }
        System.out.println("Pedido não encontrado!");
    }

    public List<Pedido> obterPedidos() {
        return Collections.unmodifiableList(pedidos);
    }
}