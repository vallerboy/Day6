public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(2);

        System.out.println(circle.calculateArea());
        System.out.println(circle1.calculateArea());
        System.out.println(circle2.calculateArea());
    }
}
