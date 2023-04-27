package Übungen;
import java.util.Scanner;

public class Übung24 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary Number: ");
        String binaryNumber = scanner.nextLine();
        scanner.close();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("The binary Number " + binaryNumber + " is in octal " + octalNumber);

    }

}
