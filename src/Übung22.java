import java.util.Scanner;

public class Übung22 {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.println("Binary number " + binaryNumber + " in decimal is " + decimalNumber);
        
        scanner.close();
    }


}
