package Decorator;

public class Cafe implements Bebida {
    private double preco;
    private String descricao;

    @Override
    public double getPreco() {
        return 2.0;
    }

    @Override
    public String getDescricao() {
        return "Café Simples";
    }
    

}
