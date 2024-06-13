public class ContaCorrente implements iConta {

    private int numero;
    private double saldo;

    public ContaCorrente(int numero, ClienteBanco cliente) {
        this.numero = numero;
        this.saldo = 0; // Inicializa o saldo com zero para uma conta nova
        // Aqui você pode adicionar lógica adicional, se necessário, para inicializar outros atributos
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para sacar R$" + valor + ".");
        }
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + destino.getNumero() + ".");
        } else {
            System.out.println("Saldo insuficiente para transferir R$" + valor + ".");
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
