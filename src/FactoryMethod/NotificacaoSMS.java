package FactoryMethod;

public class NotificacaoSMS implements IntNotificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS...");
    }
}
