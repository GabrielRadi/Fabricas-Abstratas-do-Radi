package FactoryAbstract;
class Main {
    public static void main(String[] args) {
        renderizar(new FabricaAndroid());
        renderizar(new FabricaIOS());
    }

    private static void renderizar(FabricaComponentes fabrica) {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}
