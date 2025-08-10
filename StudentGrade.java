import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        if (score < 0 || score > 100) {
            System.out.println("Can't accept it");
        } else if (score >= 97) {
            System.out.println("A+");
        } else if (score >= 93) {
            System.out.println("A");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 87) {
            System.out.println("B+");
        } else if (score >= 83) {
            System.out.println("B");
        } else if (score >= 80) {
            System.out.println("B-");
        } else if (score >= 77) {
            System.out.println("C+");
        } else if (score >= 73) {
            System.out.println("C");
        } else if (score >= 70) {
            System.out.println("C-");
        } else if (score >= 67) {
            System.out.println("D+");
        } else if (score >= 63) {
            System.out.println("D");
        } else if (score >= 60) {
            System.out.println("D-");
        } else {
            System.out.println("F");
        }
    }
            }
