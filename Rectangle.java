import java.text.MessageFormat;

public class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println(MessageFormat.format("a: {0}, b: {1}", a, b));
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (a + b) * 2);
    }

    public void area() {
        System.out.println("Area: " + a * b);
    }
}