package Delivery_System.Pedido;

import Delivery_System.Notificacao.Notificacao;

public class Pedido {

    private int codigo;
    private String descricao;
    private String cliente;
    private Notificacao notificacao;
    private double valor;
    private boolean pago;

    public Pedido(int codigo, String descricao, String cliente, Notificacao notificacao, double valor, boolean pago) {

        this.codigo = codigo;
        this.descricao = descricao;
        this.cliente = cliente;
        this.notificacao = notificacao;
        this.valor = valor;
        this.pago = pago;
    }

    public void enviarNotificacao(String mensagem) {
        notificacao.enviarMensagem(mensagem);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCliente() {
        return cliente;
    }

    public Notificacao getNotificacao() {
        return notificacao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}