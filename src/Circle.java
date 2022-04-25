/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

//implement Shape interface and provide abstract method implementation
public class Circle implements Shape{


    /*
    Define an instance variable called as pi and give initial value as 3.14
    Instance variable must be private, static and final
    double pi
     */
    private final static double pi = 3.14;


    /*
    Define an instance variable for Circle called as radius
    Instance variable must be encapsulated
    double radius
     */
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
        Override area and perimeter methods here
        REMEMBER:
        Area of a circle can be found as => π * r * r
        Basically it is => pi * radius * radius

        Perimeter of a circle can be found as => 2 * π * r
        Basically it is => 2 * pi * radius
        */
    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    //Override toString() method here


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
