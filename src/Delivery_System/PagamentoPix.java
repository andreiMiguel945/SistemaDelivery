package Delivery_System;

public class PagamentoPix implements Pagamento {

    private double valorPedido;

    public PagamentoPix(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    @Override
    public boolean Pagar(double valorInserido) {

        if (valorInserido > 0 && valorInserido == valorPedido) {
            System.out.println("Pagamento realizado via PIX!");
            System.out.println("Valor: R$ " + valorPedido);
            return true;
        }

        System.out.println("Valor inválido!");
        return false;
    }
}