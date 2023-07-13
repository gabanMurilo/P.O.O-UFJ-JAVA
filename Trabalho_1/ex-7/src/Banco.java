import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaCorrente> contas;

    public Banco() {
        this.contas = new ArrayList<ContaCorrente>();
    }
    public void criarConta(int numero, double saldo, boolean especial, double limite) {
        this.contas.add(new ContaCorrente(numero, saldo, especial, limite));
    }
    public void excluirConta(int numero) {
        for (ContaCorrente conta : this.contas) {
            if (conta.getNumero() == numero) {
                this.contas.remove(conta);
                break;
            }
        }
    }
    public void saque(int numero, double valor) {
        for (ContaCorrente conta : this.contas) {
            if (conta.getNumero() == numero) {
                conta.sacar(valor);
                break;
            }
        }
    }
    public void deposito(int numero, double valor) {
        for (ContaCorrente conta : this.contas) {
            if (conta.getNumero() == numero) {
                conta.depositar(valor);
                break;
            }
        }
    }
    public void emitirSaldo(int numero) {
        for (ContaCorrente conta : this.contas) {
            if (conta.getNumero() == numero) {
                conta.emitirSaldo();
                break;
            }
        }
    }
    public void emitirExtrato(int numero) {
        for (ContaCorrente conta : this.contas) {
            if (conta.getNumero() == numero) {
                conta.emitirExtrato();
                break;
            }
        }
    }
    public void transferencia(int numeroOrigem, int numeroDestino, double valor) {
        for (ContaCorrente contaOrigem : this.contas) {
            if (contaOrigem.getNumero() == numeroOrigem) {
                for (ContaCorrente contaDestino : this.contas) {
                    if (contaDestino.getNumero() == numeroDestino) {
                        contaOrigem.transferir(contaDestino, valor);
                        break;
                    }
                }
                break;
            }
        }
    }
    private ContaCorrente buscarConta(int numero) {
        for (ContaCorrente conta : this.contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}
