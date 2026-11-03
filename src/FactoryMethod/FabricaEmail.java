package FactoryMethod;

public class FabricaEmail extends FactoryNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new NotificacaoEmail();
    }
}
