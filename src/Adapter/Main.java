package Adapter;

public class Main {
    public static void main(String[] args) {
        Pagamentos cartao = new CartaoPagamento();
        Pagamentos pix = new PixPagamento(new PixAPIExterna());

        cartao.pagar(100.0);
        pix.pagar(50.0);
    }
}