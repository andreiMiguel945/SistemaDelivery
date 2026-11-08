package Delivery_System.GerenciamentoEntrega;

public interface GerenciamentoEntrega {

    void criarEntrega(int codigoPedido, String endereco);

    void atribuirEntregador(int codigoPedido, String entregador);

    void atualizarStatus(int codigoPedido, String status);

    void consultarEntrega(int codigoPedido);
}