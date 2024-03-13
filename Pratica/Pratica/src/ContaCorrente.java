public class ContaCorrente {
    public String nome;
    public int agencia;
    public int conta;
    private double limite = 0;
    private double saldo = 0;

    public void setSaldo(double valor){
        this.saldo=valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void Depositar(double valor){
        this.saldo+=valor;
        tarifa();
    }
    public void sacar(double valor){
        this.saldo-=valor;
        tarifa();
    }
    private void tarifa(){
        this.saldo-=10;
    }
}
