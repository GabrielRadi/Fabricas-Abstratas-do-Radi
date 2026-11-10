package Adapter;

public class PixPagamento implements Pagamentos {
    private PixAPIExterna pixAPI;

    public PixPagamento(PixAPIExterna pixAPI) {
        this.pixAPI = pixAPI;
    }

    @Override
    public void pagar(double valor) {
        pixAPI.pagarComPix(valor);
    }
}
