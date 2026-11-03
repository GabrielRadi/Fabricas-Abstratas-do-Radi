package FactoryMethod;

public class FabricaSMS extends FactoryNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new NotificacaoSMS();
    }
}
