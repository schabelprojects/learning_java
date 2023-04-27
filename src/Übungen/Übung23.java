package Übungen;
import java.util.Scanner;

public class Übung23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();
        scanner.close();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String hexNumber = Integer.toHexString(decimalNumber);

        System.out.println("Binary number " + binaryNumber + " in hexadecimal is " + hexNumber.toUpperCase());
    }
}
