package Heranca2;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente MC = new ContaCorrente(4568, 1000);

        MC.alterarLimite(1500);
        System.out.println("\n");
        System.out.println("Conta: " + MC.obterNumero());
        System.out.printf("Limite da conta: R$ %.2f" , MC.consultarLimite());
        System.out.printf("\nSaldo total: R$ %.2f" , MC.consultarSaldoTotal());


        MC.depositar(3000);
        System.out.println("\n");
        System.out.println("Conta: " + MC.obterNumero());
        System.out.printf("Limite da conta: R$ %.2f" , MC.consultarLimite());
        System.out.printf("\nSaldo total: R$ %.2f" , MC.consultarSaldoTotal());


        if(MC.sacar((2000))) {
            System.out.println("\n");
            System.out.println("Conta: " + MC.obterNumero());
            System.out.printf("Limite da conta: R$ %.2f", MC.consultarLimite());
            System.out.printf("\nSaldo total: R$ %.2f", MC.consultarSaldoTotal());
        }
        else {
            System.out.println("\nNão foi possivel relizar o saque, o saldo total e de: ");
            System.out.printf("Saldo total: R$ %.2f", MC.consultarSaldoTotal());
        }
    }
}
