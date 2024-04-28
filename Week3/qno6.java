import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {
    //     6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an alphabet: ");
    char alphabet = scanner.next().toLowerCase().charAt(0);
    scanner.close();

    if ((alphabet >= 'a' && alphabet <= 'z')) {
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet =='o' || alphabet =='u'){
            System.out.println("The entered alphabet is a vowel.");
       } else {
        System.out.println("The entered alphabet is a consonant.");
       } 
    }else {
        System.out.println("Invalid input. Please enter an alphabet.");
       }
    }
    }

