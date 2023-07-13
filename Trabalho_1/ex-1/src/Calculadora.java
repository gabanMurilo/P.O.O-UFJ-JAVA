import java.text.Format;
import java.util.Formatter;

abstract class Calculadora {
    //atributos
    double num1;
    double num2;

    //metodos
    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    Calculadora(){
        this(0,0);
    }
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    public double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public double dividir(double num1, double num2){
        return num1 / num2;
    }

    //getters e setters
    public double getNum1(){
        return this.num1;
    }
    public double getNum2(){
        return this.num2;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public String toString(){
        return String.format("Soma: %.2f"
                + "\nSubtração: %.2f"
                            + "\nMultiplicação: %.2f"
                            + "\nDivisão: %.2f",
                            somar(num1, num2),
                            subtrair(num1, num2),
                            multiplicar(num1, num2),
                            dividir(num1, num2));
    }

}
