package Adapter;

public class CartaoPagamento implements Pagamentos {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via cartão de crédito de: R$" + valor);
    }
}
