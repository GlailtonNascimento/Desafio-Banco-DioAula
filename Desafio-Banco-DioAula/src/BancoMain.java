

public class BancoMain {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", 123, "Cidade", "Estado", "12345-678");

        ClienteBanco cliente1 = new ClienteBanco("Cliente 1", endereco);
        Conta conta1 = new ContaCorrente(1, cliente1);
        cliente1.adicionarConta(conta1);

        ClienteBanco cliente2 = new ClienteBanco("Cliente 2", endereco);
        Conta conta2 = new ContaPoupanca(2, cliente2);
        cliente2.adicionarConta(conta2);

        conta1.depositar(1000);
        conta1.transferir(100, conta2.getNumero(), 1234);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
    }
}
