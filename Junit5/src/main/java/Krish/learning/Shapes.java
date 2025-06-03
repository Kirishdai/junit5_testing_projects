package Krish.learning;

/**
 * Utility class for computing areas of basic geometric shapes.
 */
public class Shapes {

    /**
     * Computes the area of a square.
     *
     * @param length the length of one side of the square
     * @return the area of the square
     */
    public double computeSquareArea(double length) {
        return length * length;
    }

    /**
     * Computes the area of a circle and rounds it down to the nearest whole number.
     *
     * @param radius the radius of the circle
     * @return the floored area of the circle
     */
    public double computeCircleArea(double radius) {
        // Math.PI gives the value of π; area = π * r^2
        // Math.floor() rounds the result down to the nearest whole number
        return Math.floor(Math.PI * radius * radius);
    }
}
