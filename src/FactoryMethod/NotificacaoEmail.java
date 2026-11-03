package FactoryMethod;

public class NotificacaoEmail implements IntNotificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por e-mail...");
    }
}
