/*
 * Создайте иерархию классов для представления различных геометрических фигур. Каждая фигура должна иметь метод для вычисления площади
 * (calculateArea) и метод для вычисления периметра (calculatePerimeter). Реализуйте следующие фигуры:
 Круг (Circle):

Свойства: радиус (radius).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.
Прямоугольник (Rectangle):

Свойства: длина (length) и ширина (width).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.
Квадрат (Square), который является подклассом прямоугольника:

Свойства: сторона (side).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно. И переопределите методы родительского класса, чтобы они соответствовали квадрату.
 */

public class Task {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calculatePerimeter());
        System.out.println(c.calculateArea());
        System.out.println("-------------");
        Rectangle r = new Rectangle(3, 2);
        System.out.println(r.calculatePerimeter());
        System.out.println(r.calculateArea());
        System.out.println("-------------");
        Square s = new Square(7);
        System.out.println(s.calculatePerimeter());
        System.out.println(s.calculateArea());
    }
}
