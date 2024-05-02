import java.util.Scanner;
public class Area {
      public static double calculateArea(double length, double width) {
        return length * width;
    }
         public static double calculateArea(double side) {
        return side * side;
    }
    public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }
    public static double calculateArea(float base, double height) {
        return 0.5 * base * height;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = calculateArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);
        
        // Square
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        double squareArea = calculateArea(side);
        System.out.println("Area of Square: " + squareArea);
        
        // Circle
        System.out.print("Enter radius of circle: ");
        float radius = scanner.nextFloat();
        double circleArea = calculateArea(radius);
        System.out.println("Area of Circle: " + circleArea);
        
        // Triangle
        System.out.print("Enter base of triangle: ");
        float base = scanner.nextFloat();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        double triangleArea = calculateArea(base, height);
        System.out.println("Area of Triangle: " + triangleArea);
        scanner.close();
    }
}
