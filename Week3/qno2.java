import java.util.Scanner;

public class qno2 {
    public static void main(String[] args) {
     //2. Write a JAVA program to check whether a number is negative, positive, or zero.  
        Scanner scan1 = new Scanner(System.in);
     
        System.out.print("Enter a number: ");
        double number = scan1.nextDouble();
        scan1.close();

        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    
}
