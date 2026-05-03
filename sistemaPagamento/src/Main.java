import model.BoletoBancario;
import model.CartaoCredito;
import model.Pix;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---SISTEMA DE PAGAMENTO---\n");
        CartaoCredito cartao = new CartaoCredito(250.00);
        BoletoBancario boleto = new BoletoBancario(1000.00);
        Pix pix = new Pix(3000.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
    }
}