import java.text.MessageFormat;

public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print() {
        System.out.println(MessageFormat.format("a: {0}, b: {1}, c: {2}", a, b, c));
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (a + b + c));
    }

    public void area() {
        double p = (a + b + c) * 0.5;
        System.out.println("Area: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}