package Delivery_System.Notificacao;

public class Whatsapp implements Notificacao {
    private String numeroWhats;

    public Whatsapp(String numeroWhats) {
        this.numeroWhats = numeroWhats;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Mensagem para " + getNumeroWhats());
        System.out.println("Mensagem: " + mensagem);
    }

    public String getNumeroWhats() {
        return numeroWhats;
    }
}
