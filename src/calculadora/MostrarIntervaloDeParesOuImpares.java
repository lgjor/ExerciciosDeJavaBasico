package calculadora;

import java.util.Scanner;
import util.ValidaValorInt;

public class MostrarIntervaloDeParesOuImpares {

    public MostrarIntervaloDeParesOuImpares(){
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numero01 = ValidaValorInt.validaValorInt(scanner, "Digite o primeiro número do intervalo: ");
        int numero02 = ValidaValorInt.validaValorInt(scanner, "Digite o segundo número do intervalo: ");
        while (numero02 <= numero01) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            numero02 = ValidaValorInt.validaValorInt(scanner, "Digite o segundo número do intervalo: ");
        }
        System.out.println("Digite 1 para exibir números ímpares");
        System.out.println("Digite 2 para exibir números pares");
            int parouimpar = ValidaValorInt.validaValorInt(scanner, "Insira a opção desejada: ");
            while (parouimpar < 1 || parouimpar>2){
                parouimpar = ValidaValorInt.validaValorInt(scanner, "Opção inválida, tente novamente com 1 ou 2: ");
            }
        switch (parouimpar) {
            case 1:
                ExibirIntervaloDeImpares(numero01, numero02);
                break;
            case 2:
                ExibirIntervaloDePares(numero01, numero02);
                break;
        }

    }

    public static void ExibirIntervaloDeImpares(int numero01, int numero02){
        System.out.println("--- Exibindo intervalo de números Ímpares");
        for (int i = numero01; i <= numero02; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
    public static void ExibirIntervaloDePares(int numero01, int numero02){
        System.out.println("--- Exibindo intervalo de números Pares ---");
        for (int i = numero01; i <= numero02; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}