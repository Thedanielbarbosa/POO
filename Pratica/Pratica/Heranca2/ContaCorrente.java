package Heranca2;

public class ContaCorrente extends Conta {

    double limite;

    public ContaCorrente(long n, double l) {
        super(n);
        if(l > 0)
            this.limite = l;
    }

    public void alterarLimite(double l) {
        if(l > 0)
            this.limite = l;
    }

    public double consultarLimite() {
        return this.limite;
    }

    public double consultarSaldoTotal() {
        return (this.saldo + this.limite);
    }
}
