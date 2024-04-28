import java.util.Scanner;

public class qno2 {
    public static void main(String[] args) {
    // 2. Write a program to calculate SI.
    // Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
 
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Principle:");
        float PrincipleAmount = scan1.nextFloat();
        System.out.println("Enter Time:");
        float Time = scan1.nextFloat();
        System.out.println("Enter Rate:");
        float Rate = scan1.nextFloat();
        float SI = (PrincipleAmount*Time*Rate/100);
        System.out.println("Simple Interest is "+ SI);
    }
    
}
