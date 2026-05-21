public class Main {
    public static void main(String[] args) {
Shape rectangle = new Rectangle(10.0, 5.0);
Shape circle = new Circle(12.0);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь круга: " + circle.getArea());
    }
}
