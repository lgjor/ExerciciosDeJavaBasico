// Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados.
package calculadora;

import java.util.Scanner;
import util.ValidaValorInt;

public class NNumeros {
    public NNumeros() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numero01 = ValidaValorInt.validaValorInt(scanner, "Informe um número inicial: ");
        int numero02;
        do{
            numero02 = ValidaValorInt.validaValorInt(scanner, "Informe outro número: ");
        } while( numero02 < numero01 && numero02 % numero01 != 0);
    }
}