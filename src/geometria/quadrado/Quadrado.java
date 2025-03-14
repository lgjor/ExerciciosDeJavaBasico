/**
 * This package contains classes and interfaces related to the geometric shape Quadrado (Square).
 * It includes implementations and utilities for working with squares in a geometric context.
 */
package geometria.quadrado;

/**
 * A classe Quadrado representa um quadrado com um determinado lado.
 * Ela fornece um método para calcular a área do quadrado.
 */
public class Quadrado {
    private double lado;

    /**
     * Constructs a new Quadrado (Square) with the specified side length.
     *
     * @param lado the length of the side of the square
     */
    public Quadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Calculates the area of the square.
     *
     * @return the area of the square
     */
    public double calcularArea() {
        return lado * lado;
    }
}