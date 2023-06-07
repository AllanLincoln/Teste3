public class CartaoCredito implements PaymentMethod {
    private int numParcelas;

    public CartaoCredito(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public void efetuarPagamento(double valor) {
        double valorParcela = valor / numParcelas;
        System.out.println("Pagamento via cartão de crédito em " + numParcelas + "x de R$" + valorParcela + " realizado com sucesso.");
    }

    public void validar (double valor) {
        if (valor <= 100) {
            throw new RuntimeException("Valor mínimo para pagamento com cartão de crédito é de R$100.");
        }

    }
}
