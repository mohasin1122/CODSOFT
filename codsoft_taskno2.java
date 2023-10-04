import java.util.Scanner;

public class codsoft_taskno2 {
    public static String caclGrade(double n) {

        // Assign grades         
        if (n >= 90) {
            return "A+";
        } else if (n >= 80) {
            return "A";
        } else if (n >= 70) {
            return "B";
        } else if (n >= 60) {
            return "C";
        } else if (n >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.print("Enter total number of subjects: ");
        int sub = cs.nextInt();

        int totals = 0;

        for (int i = 1; i <= sub; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = cs.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("invalid input ! Please enter the marks within the range of 0 to 100");
                return; 
            }
            totals += marks;
        }

        double averagePercentage = (double) totals / (sub * 100) * 100;
        String grade = caclGrade(averagePercentage);

        // Display results

        System.out.println("\n Total Marks: " + totals);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        cs.close();
    }

    
}
