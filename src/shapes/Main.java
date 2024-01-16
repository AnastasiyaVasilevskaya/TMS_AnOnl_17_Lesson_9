package shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(1, 2, 3);
        shapes[1] = new Rectangle(20, 30);
        shapes[2] = new Triangle(11, 22, 33);
        shapes[3] = new Circle(5);
        shapes[4] = new Circle(6);

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        System.out.printf("Сумма периметров всех фигур в массиве: %.2f", totalPerimeter);
    }
}