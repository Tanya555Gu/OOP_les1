public class Task {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c.calculatePerimeter());
        System.out.println(c.calculateArea());
        System.out.println("-------------");
        Rectangle r = new Rectangle(1, 2);
        System.out.println(r.calculatePerimeter());
        System.out.println(r.calculateArea());
        System.out.println("-------------");
        Square s = new Square(5);
        System.out.println(s.calculatePerimeter());
        System.out.println(s.calculateArea());
    }
}
