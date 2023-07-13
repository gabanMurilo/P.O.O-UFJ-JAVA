public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro( 4, "Azul", 1972, 131, 5000);
        Caminhao caminhao = new Caminhao( 100, 4, "Vermelho", 1985, 1100, 410000);
        Motocicleta motocicleta = new Motocicleta( 250, "titan", "honda", "Verde", 2016, 48, 1500);

        System.out.println(carro.toString());
        System.out.println(caminhao.toString());
        System.out.println(motocicleta.toString());

        Carro marea = new Carro(2, "Verde", 1988, 122, 3400);
        Caminhao scania = new Caminhao( 200, 16, "Branco", 2010, 1800, 500000);
        Motocicleta fan = new Motocicleta( 150, "Fan", "Honda", "Cinza", 2009, 22, 10000);

        System.out.println(marea.toString());
        System.out.println(scania.toString());
        System.out.println(fan.toString());
    }
}