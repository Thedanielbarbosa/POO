package Heranca2;

public class Conta {

    long numero;
    double saldo;

    public Conta(long n) {
        this.numero = n;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor>0)
            this.saldo = saldo+valor;
    }
    public boolean sacar(double valor) {
        if(valor > 0 && (saldo - valor >= 0)) {
            this.saldo = saldo-valor;
            return true;
        }

        else
            return false;
    }
    public double consultarSaldo() {
        return this.saldo;
    }

    public long obterNumero() {
        return numero;
    }
}
