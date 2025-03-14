/**
 * This class is part of the geometria.retangulo package.
 * It is intended to provide functionalities related to square calculations.
 */
package geometria.retangulo;

import java.util.InputMismatchException;
import util.ValidaValorInt;
import java.util.Scanner;
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

public class CalculadoraRetangulo{
    
    public CalculadoraRetangulo() {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado = ValidaValorInt.validaValorInt(scanner, "Digite a largura do retângulo: ");
        double altura = ValidaValorInt.validaValorInt(scanner, "Digite a altura do retângulo: ");
        scanner.close();        
        Retangulo retangulo = new Retangulo(lado, altura);
        double area = retangulo.calcularArea();

        System.out.println("A área do retângulo é: " + area);
    
    }
}