package Decorator;

public class Acucar extends BebidaDecorator {
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.20;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Açúcar";
    }
    
}
