public class Pix implements PaymentMethod {
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento via Pix no valor de R$" + valor + " realizado com sucesso.");
    }
}
