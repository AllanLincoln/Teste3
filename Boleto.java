public class Boleto implements PaymentMethod {
    public void efetuarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor + ".");
        // Lógica para gerar o boleto
        System.out.println("Pagamento via boleto gerado com sucesso.");
    }
}
