public class BancoTeste {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.criarConta(1, 1000, false, 0);
        banco.criarConta(2, 2000, true, 1000);

        banco.emitirSaldo(1);
        banco.emitirSaldo(2);

        banco.saque(1, 100);
        banco.saque(2, 100);

        banco.emitirSaldo(1);
        banco.emitirSaldo(2);

        banco.deposito(1, 100);
        banco.deposito(2, 100);

        banco.emitirExtrato(1);
        banco.emitirExtrato(2);
    }
}