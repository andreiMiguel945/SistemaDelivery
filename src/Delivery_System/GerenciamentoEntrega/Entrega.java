package Delivery_System.GerenciamentoEntrega;

import Delivery_System.Pedido.Pedido;

public class Entrega {

    private Pedido pedido;
    private String endereco;
    private String entregador;
    private String status;

    public Entrega(Pedido pedido, String endereco) {
        this.pedido = pedido;
        this.endereco = endereco;
        this.entregador = "Não atribuído";
        this.status = "Aguardando entrega";
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEntregador() {
        return entregador;
    }

    public String getStatus() {
        return status;
    }

    public void setEntregador(String entregador) {
        this.entregador = entregador;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}