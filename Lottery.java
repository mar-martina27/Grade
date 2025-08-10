import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random two-digit number
        int lottoNumber = random.nextInt(90) + 10; // Range 10-99
        
        // Get user input
        System.out.print("Enter in a two digit number: ");
        int userNumber = scanner.nextInt();
        
        // Extract digits
        int userDigit1 = userNumber / 10;
        int userDigit2 = userNumber % 10;
        int lottoDigit1 = lottoNumber / 10;
        int lottoDigit2 = lottoNumber % 10;
        
        System.out.println("The lotto number is: " + lottoNumber);
        
        // Check for matches
        if (userNumber == lottoNumber) {
            System.out.println("YOU GOT IT!!!");
            System.out.println("You win the Jackpot of $10,000");
        } 
        else if ((userDigit1 == lottoDigit2) && (userDigit2 == lottoDigit1)) {
            System.out.println("You got both digits correct.");
            System.out.println("You win $2,000");
        } 
        else if (userDigit1 == lottoDigit1 || userDigit1 == lottoDigit2 || 
                 userDigit2 == lottoDigit1 || userDigit2 == lottoDigit2) {
            System.out.println("You got one digit correct.");
            System.out.println("You win $500");
        } 
        else {
            System.out.println("You did not win anything :(");
        }
    }
}import java.util.Scanner;

public class SimpleIPValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for each octet and check it immediately
        System.out.print("Please enter the first octet: ");
        int octet1 = scanner.nextInt();
        if (octet1 < 0 || octet1 > 255) {
            System.out.println("Octet 1 is incorrect");
            return;
        }
        
        System.out.print("Please enter the second octet: ");
        int octet2 = scanner.nextInt();
        if (octet2 < 0 || octet2 > 255) {
            System.out.println("Octet 2 is incorrect");
            return;
        }
        
        System.out.print("Please enter the third octet: ");
        int octet3 = scanner.nextInt();
        if (octet3 < 0 || octet3 > 255) {
            System.out.println("Octet 3 is incorrect");
            return;
        }
        
        System.out.print("Please enter the fourth octet: ");
        int octet4 = scanner.nextInt();
        if (octet4 < 0 || octet4 > 255) {
            System.out.println("Octet 4 is incorrect");
            return;
        }
        
        // If we got here, all octets are valid
        System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
    }
          }
