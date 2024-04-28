import java.util.Scanner;

public class qno8 {
    public static void main(String[] args) {
        // 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
        Scanner scanner = new Scanner(System.in);

        // to calculate the Area and Perimeter of square
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        scanner.nextLine();
        double areaOfSquare = side * side;
        double perimeterOfSquare = 4 * side;
        System.out.println("Area of the square: " + areaOfSquare);
        System.out.println("Perimeter of the square: " + perimeterOfSquare);

        // to calculate the Simple Interest
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of amount: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        //to print the are of triangle
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double areOfTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areOfTriangle);

        // to calculate the volume of cube
        System.out.println("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();
        double volumeOfCube = cubeSide * cubeSide * cubeSide;
        System.out.println("Volume of the cube: " + volumeOfCube);
        
        // to calculate the volume of cuboid
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightcuboid = scanner.nextDouble();
        double volumeOfCuboid = length * width * heightcuboid;
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);
        
        scanner.close();
        }
    
}
