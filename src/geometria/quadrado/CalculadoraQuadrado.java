/**
 * This class is part of the geometria.quadrado package.
 * It is intended to provide functionalities related to square calculations.
 */
package geometria.quadrado;

import java.util.InputMismatchException;
/**
 * This class provides methods to perform calculations related to squares.
 * It includes functionalities to calculate the area of a square.
 * 
 * The class uses the Scanner class from java.util package to read input from the user.
 * 
 * Example usage:
 * <pre>
 * {@code
 * CalculadoraQuadrado calculadora = new CalculadoraQuadrado();
 * double area = calculadora.calcularArea(lado);
 * double perimetro = calculadora.calcularPerimetro(lado);
 * }
 * </pre>
 * 
 * @author Lucas Aú Desviante
 * @version 1.0
 */
import java.util.Scanner;

/**
 * A classe CalculadoraQuadrado é responsável por ler o tamanho do lado de um quadrado
 * a partir da entrada do usuário, calcular a área do quadrado e exibir o resultado.
 * 
 * <p>Esta classe utiliza a classe Scanner para ler a entrada do usuário e a classe
 * Quadrado para calcular a área do quadrado.</p>
 * 
 * <p>Exemplo de uso:</p>
 * <pre>
 * {@code
 * java CalculadoraQuadrado
 * Digite o tamanho do lado do quadrado: 5
 * A área do quadrado é: 25.0
 * }
 * </pre>
 * 
 * @author Lucas Aú Desviante
 * @version 1.0
 */
public class CalculadoraQuadrado {

    /**
     * Default constructor for CalculadoraQuadrado
     */
    public CalculadoraQuadrado() {
    }

    /**
    * Main method to execute the square area calculator
    * @param args command line arguments (not used)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado = validaLado(scanner, "Digite o tamanho do lado do quadrado: ");

        Quadrado quadrado = new Quadrado(lado);
        double area = quadrado.calcularArea();

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }

    /**
     * Valida a entrada do usuário para garantir que seja um número positivo.
     * 
     * @param scanner  o objeto Scanner usado para ler a entrada do usuário
     * @param mensagem a mensagem a ser exibida ao solicitar a entrada do usuário
     * @return o valor positivo inserido pelo usuário
     * @throws InputMismatchException se a entrada do usuário não for um número válido
     */
    public static double validaLado(Scanner scanner, String mensagem) {
        double valor;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble();
                if (valor > 0) {
                    return valor;
                }
                System.out.println("O valor deve ser maior que zero.");
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

}