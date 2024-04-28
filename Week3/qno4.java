import java.util.Scanner;

public class qno4 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan1.nextInt();
        scan1.close();

        if (number % 2 == 0){
            System.out.println("The number is even. ");
        } else {
            System.out.println("The number is odd. ");
        }
    }
    
}
