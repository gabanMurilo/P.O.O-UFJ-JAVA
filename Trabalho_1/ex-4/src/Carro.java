public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(int numeroPortas, String cor, int ano, int potencia, int valor) {
        super(cor, ano, potencia, valor);
        this.numeroPortas = numeroPortas;
    }
    public Carro() {
        super();
        this.numeroPortas = 4;
    }
    public int getNumeroPortas() {
        return this.numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    public String toString() {
        return "Carro:\n" + "numeroPortas=" + numeroPortas +
                "\ncor=" + getCor() +
                "\nano=" + getAno() +
                "\npotencia=" + getPotencia() +
                "\nvalor=" + getValor();
    }
}
