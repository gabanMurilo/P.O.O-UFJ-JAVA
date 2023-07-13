public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(07, 12, 2023);
        data1.exibeData();

        data1.setDia(12);
        data1.setMes(12);
        data1.setAno(2016);
        data1.exibeData();

        int mes = data1.getMes();
        int dia = data1.getDia();
        int ano = data1.getAno();
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
