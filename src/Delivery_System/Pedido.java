package Delivery_System;

public class Pedido {

    private int codigo;
    private String descricao;
    private String cliente;
    private double valor;
    private boolean pago;

    public Pedido(int codigo, String descricao,
                  String cliente, double valor, boolean pago) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cliente = cliente;
        this.valor = valor;
        this.pago = pago;
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

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}