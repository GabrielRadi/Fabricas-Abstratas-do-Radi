package FactoryAbstract;

public class FabricaIOS implements FabricaComponentes {
    @Override
    public Botao criarBotao() {
        return new BotaoIOS();
    }

    @Override
    public Input criarInput() {
        return new InputIOS();
    }
}
