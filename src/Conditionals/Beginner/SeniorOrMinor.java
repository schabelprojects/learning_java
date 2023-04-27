package Conditionals.Beginner;

import java.util.Scanner;

public class SeniorOrMinor {
    

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        if( age < 18) {
            System.out.println("You are a minor.");
        } else if( age >= 18 && age <= 65){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior adult.");
        }

        scanner.close();

    }
}
