package Delivery_System.Pagamento;

public class PagamentoDinheiro implements Pagamento {

    private double valorPedido;

    public PagamentoDinheiro(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    @Override
    public boolean Pagar(double valorInserido) {

        if (valorInserido >= valorPedido && valorInserido > 0) {

            double troco = valorInserido - valorPedido;

            System.out.println("Pagamento realizado em dinheiro!");
            System.out.println("Valor do pedido: R$ " + valorPedido);
            System.out.println("Valor recebido: R$ " + valorInserido);
            System.out.println("Troco: R$ " + troco);

            return true;

        } else {
            System.out.println("Valor insuficiente para realizar o pagamento!");
            return false;
        }
    }
}