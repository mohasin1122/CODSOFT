import java.util.Random;
import java.util.Scanner;


public class codsoft_taskno1 {
    
    public static int playRound(Scanner cs) {
        Random random = new Random();
        int lowerCse = 1;
        int upperbound = 100;
        int atmptMax = 10;
        int total = 0;

        int goal = random.nextInt(upperbound - lowerCse + 1) + lowerCse;
        int attempts = 0;

        System.out.println(" let's think a number between " + lowerCse + " and " + upperbound + ".");

        while (attempts < atmptMax) {
            System.out.print("Enter your guess number : ");
            int UG = cs.nextInt();
            attempts++;

            if (UG == goal) {
                System.out.println("Congratulations! in " + attempts + " attempts You guess the correct number.");
                total++;
                break;
            } else if (UG < goal) {
                System.out.println("Too low! enter higher than previous Try again.");
            } else {
                System.out.println("Too high! enter lower than previous Try again.");
            }
        }

        if (attempts >= atmptMax) {
            System.out.println("Sorry,  The correct number was: " + goal);
        }

        return total;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int total = 0;



        while (true) {
            int roundscore = playRound(cs);
            total += roundscore;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = cs.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your total score is: " + total);
                break;
            }
        }

        cs.close();
    }

}
