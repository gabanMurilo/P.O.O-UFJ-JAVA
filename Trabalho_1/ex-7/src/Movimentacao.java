import java.util.ArrayList;
import java.util.List;

public class Movimentacao {
    private String tipo;
    private double valor;
    private boolean credito;

    public Movimentacao(String tipo, double valor, boolean credito) {
        this.tipo = tipo;
        this.valor = valor;
        this.credito = credito;
    }
    Movimentacao() {
        this("", 0, false);
    }


    public String getTipo() {
        return this.tipo;
    }
    public double getValor() {
        return this.valor;
    }
    public boolean isCredito() {
        return this.credito;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setCredito(boolean credito) {
        this.credito = credito;
    }

}
