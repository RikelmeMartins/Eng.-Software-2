public class PagamentoPix implements Pagamento{
    @Override
    public void processarPagamento(double value) {
        System.out.printf("Pagamento no pix com valor %.2f foi efetuado com sucesso!\n", value);
    }
}
