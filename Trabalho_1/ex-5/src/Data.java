public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    Data() {
        this.mes = 1;
        this.dia = 1;
        this.ano = 1;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    public int getAno() {
        return ano;
    }
    public void exibeData() {
        System.out.println("\n" + this.dia + "/" + this.mes + "/" + this.ano + "\n");
    }
}
