public class Motocicleta extends Veiculo {
    private int cilindradas;
    private String modelo;
    private String marca;

    public Motocicleta(int cilindradas, String modelo, String marca, String cor, int ano, int potencia, int valor) {
        super(cor, ano, potencia, valor);
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.marca = marca;
    }
    public Motocicleta() {
        super();
        this.cilindradas = 100;
        this.modelo = "Modelo";
        this.marca = "Marca";
    }
    public int getCilindradas() {
        return this.cilindradas;
    }
    public String getModelo() {
        return this.modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String toString() {
        return "\n\nMotocicleta:\n" + "cilindradas=" + cilindradas +
                "\nmodelo=" + modelo +
                "\nmarca=" + marca +
                "\ncor=" + getCor() +
                "\nano=" + getAno() +
                "\npotencia=" + getPotencia() +
                "\nvalor=" + getValor();
    }
}
