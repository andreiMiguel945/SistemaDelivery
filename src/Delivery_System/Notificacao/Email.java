package Delivery_System.Notificacao;

public class Email implements Notificacao {

    private String email;

    public Email(String email) {
        this.email = email;
    }


    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem para: " + email);
        System.out.println("Mensagem: " + mensagem);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}