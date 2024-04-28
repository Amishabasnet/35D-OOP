import java.util.Scanner;

public class qno10 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter marks of four subjects (out of 100):");
        System.out.print("Subject 1: ");
        int subject1 = scan1.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scan1.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scan1.nextInt();
        System.out.print("Subject 4: ");
        int subject4 = scan1.nextInt();
        scan1.close();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;

        // Calculate percentage
        double percentage = (double) totalMarks / 4;

        // Determine the final result based on percentage
        String result = (percentage >= 70) ? "First Class"
                        : (percentage > 59) ? "Upper Second Class"
                        : (percentage > 49) ? "Second Class"
                        : (percentage > 39) ? "Third Class"
                        : "Fail";

        // Print total marks, percentage, and final result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}
