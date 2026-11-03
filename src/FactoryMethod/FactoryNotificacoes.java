package FactoryMethod;

public abstract class FactoryNotificacoes {
    public final void enviarNotificacao() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }

    protected abstract IntNotificacoes criarNotificacao();
}
