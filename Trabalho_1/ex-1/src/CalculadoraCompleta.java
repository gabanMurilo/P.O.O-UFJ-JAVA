public class CalculadoraCompleta extends Calculadora {

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double raiz(double num1) {
        return Math.sqrt(num1);
    }


    public String tostring(){
        return String.format("Soma: %.2f"
                + "\nSubtração: %.2f"
                + "\nMultiplicação: %.2f"
                + "\nDivisão: %.2f"
                + "\nPotencia: %.2f"
                + "\nRaiz: %.2f",
                somar(num1, num2),
                subtrair(num1, num2),
                multiplicar(num1, num2),
                dividir(num1, num2),
                potencia(num1, num2),
                raiz(num1));
    }
}
