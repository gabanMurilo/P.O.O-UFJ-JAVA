public class CalculadoraCompleta extends Calculadora {

    @Override
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public  double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double raiz(double num1) {
        return Math.sqrt(num1);
    }
}
