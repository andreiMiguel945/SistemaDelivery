package Delivery_System.Produto;

public class Pizza extends Produto {

    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void inserirNoPedido() {
        System.out.println("Pizza de " + getNome() + " inserido com sucesso!");
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
