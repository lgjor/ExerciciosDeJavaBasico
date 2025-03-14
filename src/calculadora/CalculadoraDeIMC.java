package calculadora;

import java.util.Scanner;
import util.ValidaValorDouble;

public class CalculadoraDeIMC {

    public CalculadoraDeIMC() {
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura = ValidaValorDouble.validaValorDouble(scanner, "Digite sua altura: ");
        double peso = ValidaValorDouble.validaValorDouble(scanner, "Digite seu peso: ");
        scanner.close();
        CalcularIMC(altura, peso);
    }
   
    public static void CalcularIMC(double altura, double peso) {
        double imc = peso / (altura * altura);
        if (imc <= 18.5)
            System.out.println("Abaixo do peso");
        else if (imc <= 24.9)
            System.out.println("Peso ideal");
        else if (imc <= 29.9)
            System.out.println("Levemente acima do peso");
        else if (imc <= 34.9)
            System.out.println("Obesidade Grau I");
        else if (imc <= 39.9)
            System.out.println("Obesidade Grau II (Severa)");
        else if (imc >= 40)
            System.out.println("Obesidade III (Mórbida)");
        else
            System.out.println("Ocorreu um erro inesperado, tente novamente.");
    }
}
