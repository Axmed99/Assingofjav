package assingnofjava2024;



//Colorable interface
interface Colorable {
 void howToColor();
}

//GeometricObject class
abstract class GeometricObject {
 private String color;

 public GeometricObject() {
     this.color = "white";
 }

 public GeometricObject(String color) {
     this.color = color;
 }

 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 public abstract double getArea();

 @Override
 public String toString() {
     return "Color: " + color;
 }
}

//Square class
class Square extends GeometricObject implements Colorable {
 private double side;

 public Square() {
     super();
     this.side = 0;
 }

 public Square(double side) {
     super();
     this.side = side;
 }

 public Square(double side, String color) {
     super(color);
     this.side = side;
 }

 public double getSide() {
     return side;
 }

 public void setSide(double side) {
     this.side = side;
 }

 @Override
 public double getArea() {
     return side * side;
 }

 @Override
 public void howToColor() {
     System.out.println("Color all four sides.");
 }
}

//Test program
public class TestColorable {
 public static void main(String[] args) {
     GeometricObject[] objects = new GeometricObject[4];
     objects[0] = new Square(5, "blue");
     objects[1] = new Square(3, "red");
     objects[2] = new Square(7, "green");
     objects[3] = new Square(4, "yellow");
    

     for (GeometricObject obj : objects) {
         System.out.println(obj.toString());
         System.out.println("Area: " + obj.getArea());
         if (obj instanceof Colorable) {
             ((Colorable) obj).howToColor();
         }
         System.out.println();
     }
 }
}
