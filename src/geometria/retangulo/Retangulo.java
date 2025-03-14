package geometria.retangulo;

public class Retangulo {
    private double lado;
    private double altura;

    /**
     * Constructs a new rectangle with the specified side and height.
     *
     * @param lado the length of the side of the square
     */
    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the square
     */
    public double calcularArea() {
        return lado * altura;
    }

}
