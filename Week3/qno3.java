import java.util.Scanner;

public class qno3 {
    public static void main(String[] args) {
        //3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan2.nextInt();
        scan2.close();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is not divisble by both 5 and 11.");
        }
    }
}
