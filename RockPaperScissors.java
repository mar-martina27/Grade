import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Rock Paper Scissors!");
        System.out.println("0=Rock, 1=Paper, 2=Scissors, 3=Quit");

        while (true) {
            System.out.print("\nYour choice: ");
            int user = scanner.nextInt();
            
            if (user == 3) break;
            if (user < 0 || user > 2) {
                System.out.println("Invalid input!");
                continue;
            }
            
            int computer = random.nextInt(3);
            System.out.println("Computer: " + computer);
            
            if (user == computer) {
                System.out.println("Tie!");
            } else if ((user + 1) % 3 == computer) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
        }
        
        System.out.println("Game ended");
        scanner.close();
    }
            }
