import java.util.Scanner;
 
public class qno1 {
    public static void main(String[] args) {
        // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        if (age > 18 ){
            System.out.println("You are eligbile to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }

    }
}