package FactoryAbstract;

public class FabricaAndroid implements FabricaComponentes {
    @Override
    public Botao criarBotao() {
        return new BotaoAndroid();
    }

    @Override
    public Input criarInput() {
        return new InputAndroid();
    }
}
