import java.text.NumberFormat;

public class testaContaCorrente {

    public static void main(String[] args) {
        NumberFormat n= NumberFormat.getCurrencyInstance();
        ContaCorrente C1 = new ContaCorrente();
        C1.nome = "Daniel";
        C1.conta = 1235;
        C1.agencia = 4519;

        C1.setSaldo(1000);
        System.out.printf("Saldo = %.2f", C1.getSaldo());
        C1.Depositar(500);
        System.out.printf("\nSaldo = %.2f", C1.getSaldo());
        C1.sacar(100);
        System.out.printf("\nSaldo = %.2f", C1.getSaldo());


    }
}
