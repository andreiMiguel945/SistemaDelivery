package Delivery_System.Pedido;

import Delivery_System.Notificacao.Notificacao;
import Delivery_System.Produto.Produto;

public interface GerenciamentoPedido {
    void criarPedido(String descricao, String cliente, Notificacao notificacao, Produto produto);

    void exibirPedido(int codigo);

    void enviarNotificacao(int codigo, String mensagem);
}
