package shapes;

public class Rectangle extends Shape {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    double calculatePerimeter() {
        return (a + b) * 2;
    }
}
