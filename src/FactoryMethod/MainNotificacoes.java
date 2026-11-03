package FactoryMethod;

public class MainNotificacoes {
    public static void main(String[] args) {
        enviar(new FabricaEmail());
        enviar(new FabricaSMS());
    }

    private static void enviar(FactoryNotificacoes fabrica) {
        fabrica.enviarNotificacao();
    }
}
