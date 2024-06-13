public abstract class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser maior que zero.");
        }
    }

    public abstract void sacar(double valor);

    public abstract void transferir(Conta destino, double valor);
}
