public class PagamentoCartao implements Pagamento{
    @Override
    public void processarPagamento(double value) {
        double acrescimo = value * 0.15;
        value += acrescimo;
        System.out.printf("Pagamento no cartão com valor %.2f foi efetuado com sucesso!\n", value);
    }
}
