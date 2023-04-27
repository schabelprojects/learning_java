package Übungen;
import java.util.Scanner;

public class Übung18 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.println("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int decimalMulti = decimal1 * decimal2;

        String binarySum = Integer.toBinaryString(decimalMulti);

        System.out.println("The multiplication of " + binary1 + " and " + binary2 + " is " + binarySum);

        scanner.close();

    }

}
