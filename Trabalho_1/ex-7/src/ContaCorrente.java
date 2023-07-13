import java.util.ArrayList;
import java.util.List;
public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    private List<Movimentacao> movimentacoes;

    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.movimentacoes = new ArrayList<Movimentacao>();
    }
    ContaCorrente() {
        this(0, 0, false, 0);
    }
    public int getNumero() {
        return this.numero;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public boolean isEspecial() {
        return this.especial;
    }
    public double getLimite() {
        return this.limite;
    }
    public List<Movimentacao> getMovimentacoes() {
        return this.movimentacoes;
    }
    public void depositar(double valor) {
        this.saldo += valor;
        this.movimentacoes.add(new Movimentacao("Depósito", valor, true));
    }
    public void sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            this.movimentacoes.add(new Movimentacao("Saque", valor, false));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void emitirSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }
    public void emitirExtrato() {
        System.out.println("Extrato:");
        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao.getTipo() + ": " + movimentacao.getValor());
        }
    }
    public void transferir(ContaCorrente conta, double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            conta.depositar(valor);
            this.movimentacoes.add(new Movimentacao("Transferência", valor, false));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

}
