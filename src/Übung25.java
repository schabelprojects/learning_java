import java.util.Scanner;

public class Übung25 {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter an octal number: ");
            int octal = sc.nextInt();
            sc.close();
    
            int decimal = 0;
            int base = 1;
    
            while (octal != 0) {
                int digit = octal % 10;
                decimal += digit * base;
                base *= 8;
                octal /= 10;
            }
    
            System.out.println("Equivalent decimal number: " + decimal);
    }
}
