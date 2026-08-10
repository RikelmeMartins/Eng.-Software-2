public class Main {

    static void main(String[] args) {

        Pagamento pagamento = new PagamentoBoleto();
        pagamento.processarPagamento(100);

        Pagamento pagamento2 = new PagamentoCartao();
        pagamento2.processarPagamento(100);

        Pagamento pagamento3 = new PagamentoPix();
        pagamento3.processarPagamento(100);
    }
}