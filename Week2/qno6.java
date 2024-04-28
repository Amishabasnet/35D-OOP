import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {
        // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int sum = num1 + num2;
        int product = num1 * num2;

        double divisionResult = (double) sum / product;
        System.out.println("Division of sum by product: " + divisionResult);

    }
    
}
