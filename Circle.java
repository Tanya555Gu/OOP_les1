/**
 * Circle
 */
public class Circle {

    private double radius;
    // double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double calculateArea(){
        return getRadius() * getRadius() * 3.14;
    }

    public double calculatePerimeter(){
        return 2 * getRadius() * 3.14;
    }
}