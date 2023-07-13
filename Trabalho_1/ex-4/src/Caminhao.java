public class Caminhao extends Veiculo{
    private int capacidadeCarga;
    private int numeroEixos;

    public Caminhao(int capacidadeCarga, int numeroEixos, String cor, int ano, int potencia, int valor) {
        super(cor, ano, potencia, valor);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }
    public Caminhao() {
        super();
        this.capacidadeCarga = 100;
        this.numeroEixos = 1;
    }
    public int getCapacidadeCarga() {
        return this.capacidadeCarga;
    }
    public int getNumeroEixos() {
        return this.numeroEixos;
    }
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
    public String toString() {
        return "\n\nCaminhao:\n" + "capacidadeCarga=" + capacidadeCarga +
                "\nnumeroEixos=" + numeroEixos +
                "\ncor=" + getCor() +
                "\nano=" + getAno() +
                "\npotencia=" + getPotencia() +
                "\nvalor=" + getValor();
    }

}
