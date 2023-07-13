public class Veiculo {
    private String cor;
    private int ano;
    private int potencia;
    private int valor;

    public Veiculo(String cor, int ano, int potencia, int valor) {
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
        this.valor = valor;
    }
    Veiculo() {
        this.cor = "Branco";
        this.ano = 2010;
        this.potencia = 1;
        this.valor = 10000;
    }
    public String getCor() {
        return this.cor;
    }
    public int getAno() {
        return this.ano;
    }
    public int getPotencia() {
        return this.potencia;
    }
    public int getValor() {
        return this.valor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
