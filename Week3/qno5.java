import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {
        // Write a JAVA program to check whether a year is a leap year or not. 
        // Hint: if year%4==0; if year%100!=0 ; year%400==0; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
