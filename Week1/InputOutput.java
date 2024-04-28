package Week1;
import java.util.Scanner;
/* Or
 * import java.util.*;
 */

public class InputOutput {
    public static void main(String[] args) {
        /* User output */
        System.out.println("This sentence will have line break");
        /* System.out.print */
        System.out.println("This will not have break");
        System.out.print("This line will continue. \n");
        /*String fromatting using system.out.printf
         * %s String, %d Integral, %f floating output, %b boolean
         * This will also break the line
         */
        System.out.printf("Hello %s, good morning","world");
        System.out.printf("The number is %d", 10 );
        /*can use multiple formatter */
        System.out.printf("\n The floating %f and boolean %b", 10.3f, false);

        /* User Input
         * import java.util.Scanner; // copy this line at the top of the code
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("This following take whole sentence");
        String wholeOutput = scan.nextLine();
        System.out.println("The input taken is " + wholeOutput);
        System.out.println("The following takes integer ");
        int intInput = scan.nextInt();
        System.out.println("The input taken is " + intInput);
        System.out.println("The following takes double");
        double doubleInput = scan.nextDouble();
        System.out.println("The input taken is " + doubleInput);
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input taken is " + booleanInput);
        scan.close(); // you must close the scanner once all input is taken


        /*Task
         * Make a new scanner object scan1
         * Prompt the following and take input
         * What is your name? save the input to string -> name
         * Are you over 18? save the input to boolean -> status
         * How many sibling? save the input the integer -> sibling
         * Print the following
         * Hello name,
         * Over 18?, status
         * You have sibling number of sibling
         */
       Scanner scan1 = new Scanner(System.in);
       System.out.printf("What is your name?", "name");
       System.out.printf("Are you over 18?", "status");
       System.out.printf("How many siblings?", "sibling");

        
    }
}
