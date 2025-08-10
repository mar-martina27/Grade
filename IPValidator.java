import java.util.Scanner;

public class IPValidator {
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
