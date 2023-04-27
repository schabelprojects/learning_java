package Conditionals.Beginner;

import java.util.Scanner;

public class Voting {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an age: ");
        int age = scanner.nextInt();

        if( age >= 18 ){
            System.out.println("You can vote!");
        } else {
            System.out.println("Sorry, you are not old enough to vote");
        }

        scanner.close();


    }
}
