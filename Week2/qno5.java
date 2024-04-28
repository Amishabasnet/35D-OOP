import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {
        // 5. Write a program to take two integer inputs from the user and print the sum and product of them.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        scanner.close();
        
        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }
}
