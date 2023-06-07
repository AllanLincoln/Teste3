import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        // Criando objetos de produtos
        Product livro = new Product("Livro", 29.99, "Um livro interessante sobre um determinado assunto.");
        Product notebook = new Product("Notebook", 1999.99, "Um notebook poderoso para uso profissional.");
        Product televisao = new Product("Televisão", 799.99, "Uma televisão de alta definição com recursos avançados.");

        // Criando carrinho de compras
        ShoppingCart cart = new ShoppingCart();

        // Adicionando produtos ao carrinho
        cart.addProduct(livro);
        cart.addProduct(notebook);
        cart.addProduct(televisao);

        // Exibindo o carrinho de compras
        cart.displayCart();

        // Removendo um produto do carrinho
        //cart.removeProduct(notebook);

        // Exibindo o carrinho de compras atualizado
        cart.displayCart();

        // Métodos de pagamento
        PaymentMethod pix = new Pix();
        PaymentMethod boleto = new Boleto();
        PaymentMethod cartaoCredito = new CartaoCredito(10);

        //Variedade de itens
        double totalAmount = cart.calculateTotal();

        // Solicitando a escolha do método de pagamento
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento: ");
        System.out.println("1 - Pix");
        System.out.println("2 - Boleto");
        System.out.println("3 - Cartão de Crédito");

        int paymentMethod = scanner.nextInt();

        // Realizando o pagamento de acordo com o método escolhido
        switch (paymentMethod) {
            case 1:
                PaymentMethod Pix = new Pix();
                pix.efetuarPagamento(cart.calculateTotal());
                break;
            case 2:
                PaymentMethod Boleto = new Boleto();
                boleto.efetuarPagamento(cart.calculateTotal());
                break;
            case 3:
                System.out.println("Digite o número de parcelas (1 a 10):");
                int numParcelas = scanner.nextInt();
                if (numParcelas < 1 || numParcelas > 10) {
                    System.out.println("Número de parcelas inválido. Pagamento não efetuado.");
                } else {
                    double valorParcela = cart.calculateTotal() / numParcelas;
                    System.out.println("Valor da parcela: " + valorParcela);
                    PaymentMethod CartaoCredito = new CartaoCredito(numParcelas);
                    cartaoCredito.efetuarPagamento(valorParcela);
                }
                break;
        }

        scanner.close();


    }
}