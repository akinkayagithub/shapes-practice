import java.util.*;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {

        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4

         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area
         */

        //1 Rectangle, 1 Square and 1 Circle object
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(5.5);
        rectangle1.setHeight(6);

        Square square1 = new Square();
        square1.setSide(2.5);

        Circle circle1 = new Circle();
        circle1.setRadius(4);

        //print each object by first adding to ArrayList
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(rectangle1);
        shapeList.add(square1);


        //for each loop to print all objects, areas, and perimeters
        for (Shape shape : shapeList){
            System.out.println(shape);
            System.out.println("Area of the " + shape.getClass().getSimpleName() + " is = " + shape.area());
            System.out.println("Perimeter of the " + shape.getClass().getSimpleName() + " is = " + shape.perimeter());
            System.out.println();
        }
        //print shape with the largest area
        //largestArea = null to store the area that is greatest for get simple name
       Shape largestArea = null;
        double maxArea = 0;
        for (Shape shape : shapeList){
            if (shape.area() > maxArea){
                maxArea = shape.area();
                largestArea = shape;
            }
        }
        System.out.println(largestArea.getClass().getSimpleName() + " has the largest area as " + maxArea);

        /*
        EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12
         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0
         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0
         Circle has the largest area as 50.24
         */
    }
}
