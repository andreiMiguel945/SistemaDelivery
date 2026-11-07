package Delivery_System.Notificacao;

public class SMS implements Notificacao {
    private String sms;

    public SMS(String mensagem) {
        this.sms = mensagem;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Mensagem para " + getSms());
        System.out.println("Mensagem: " + mensagem);
    }

    public String getSms() {
        return sms;
    }
}
