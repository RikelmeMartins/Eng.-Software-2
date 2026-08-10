public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double value) {
        double acrescimo = value * 0.05;
        value += acrescimo;
        System.out.printf("Pagamento no boleto com valor %.2f foi efetuado com sucesso!\n", value);
    }
}
