package calculadora;

import java.util.Scanner;
import util.ValidaValorInt;

public class CalculadoraDeTabuada {
    
    public CalculadoraDeTabuada () {
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = ValidaValorInt.validaValorInt(scanner, "Digite um número para calcular a tabuada:");
        scanner.close();
        CalcularTabuada(numero);
    }

    static void CalcularTabuada (int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
