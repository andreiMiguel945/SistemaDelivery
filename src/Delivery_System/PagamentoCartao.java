package Delivery_System;

public class PagamentoCartao implements Pagamento{
    private String metodoPagamento;
    private double valorPedido;
    public PagamentoCartao(String metodoPagamento, double valorPedido) {
        this.metodoPagamento = metodoPagamento;
        this.valorPedido = valorPedido;
    }

    public boolean Pagar(double valorInserido){
        if(valorInserido >0 && valorInserido == valorPedido){
            if(metodoPagamento.equals("Crédito")){
                System.out.println("Pagamento realizado no crédito!");

            }else if(metodoPagamento.equals("Débito")){
                System.out.println("Pagamento realizado no débito!");

            }else{
                System.out.println("Método de pagamento inválido");
                return false;
            }

            System.out.println("Valor: R$ " + valorPedido);
            return true;

        }else{
            System.out.println("Valor inválido ou método errado!");
            return false;
        }
    }
}
