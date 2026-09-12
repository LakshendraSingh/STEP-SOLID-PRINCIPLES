package section3_lsp;

/**
 * Section 3 - Subsection 1: (Warm-up) Demonstrating the Rectangle / Square LSP violation
 */
public class RectangleSquareDemo {
    public static void main(String[] args) {
        System.out.println("--- Section 3 - Subsection 1: Rectangle / Square Demo ---");
        
        Rectangle rectangle = new Square();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        
        // Expected for a Rectangle: 10 * 20 = 200
        // Actual output from Square: 20 * 20 = 400
        System.out.println("rectangle.setWidth(10)");
        System.out.println("rectangle.setHeight(20)");
        System.out.println("Calculated Area: " + rectangle.area() + " (Expected 200, Actual " + rectangle.area() + ")");
    }
}
