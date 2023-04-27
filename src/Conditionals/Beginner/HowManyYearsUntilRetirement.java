package Conditionals.Beginner;

import java.util.Scanner;

public class HowManyYearsUntilRetirement {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int retirement = 65;
       

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        int yearsUntilRetirement = retirement - age;

        if( age < retirement) {
            System.out.println(name + ", you have at least " + yearsUntilRetirement + " years left until you retire.");
        } else {
            System.out.println(name + ", you've already retired.");
        }

        scanner.close();

    }


}
