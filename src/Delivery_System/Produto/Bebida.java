package Delivery_System.Produto;


public class Bebida  extends Produto {

    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void inserirNoPedido() {
        System.out.println("A bebida " + getNome() + " inserido com sucesso!");
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}

