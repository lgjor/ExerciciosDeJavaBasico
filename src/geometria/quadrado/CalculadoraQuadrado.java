/**
 * This class is part of the geometria.quadrado package.
 * It is intended to provide functionalities related to square calculations.
 */
package geometria.quadrado;

import util.ValidaValorInt;
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

        double lado = ValidaValorInt.validaValorInt(scanner, "Digite o tamanho do lado do quadrado: ");

        Quadrado quadrado = new Quadrado(lado);
        double area = quadrado.calcularArea();

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }

}