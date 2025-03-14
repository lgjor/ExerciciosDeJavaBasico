/**
 * This class is part of the geometria.retangulo package.
 * It is intended to provide functionalities related to square calculations.
 */
package geometria.retangulo;

import java.util.InputMismatchException;
/**
 * This class provides methods to perform calculations related to rectangles.
 * It includes functionalities to calculate the area.
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

public class CalculadoraRetangulo{
    
    public CalculadoraRetangulo() {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = validaLado(scanner, "Digite a largura do retângulo: ");
        double altura = validaLado(scanner, "Digite a altura do retângulo: ");
        scanner.close();        
        Retangulo retangulo = new Retangulo(lado, altura);
        double area = retangulo.calcularArea();

        System.out.println("A área do retângulo é: " + area);
    
    }

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