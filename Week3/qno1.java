import java.util.Scanner;

public class qno1{
    public static void main(String[] args) {
       //1. Write a JAVA program to find the maximum between three numbers.
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter three numbers: ");
         System.out.print("Number 1: ");
         double num1 = scanner.nextDouble();

         System.out.print("Number 2: ");
         double num2 = scanner.nextDouble();

         System.out.print("Number 3: ");
         double num3 = scanner.nextDouble();
         scanner.close();
         double max;

         if(num1 >= num2 && num1 >= num3){
            max = num1;
         }else if (num2 >= num1 && num2 >= num3){
            max = num2;
         } else{
            max = num3;
         }
         System.out.println("Maximum number: " + max);
        
    }
}