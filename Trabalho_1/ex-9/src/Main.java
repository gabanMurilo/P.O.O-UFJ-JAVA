import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntradaDeCinema entradaDeCinema = new EntradaDeCinema(new Date(2019, 10, 10), 15, 1, 20);
        entradaDeCinema.setDataNascimento(new Date(2000, 10, 10));
        entradaDeCinema.setNumeroCarteiraEstudante(123456);
        System.out.println(entradaDeCinema);
        System.out.println("Valor com desconto: " + entradaDeCinema.calculaDescontoTotal());
    }
}
