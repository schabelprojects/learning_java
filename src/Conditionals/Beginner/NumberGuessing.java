package Conditionals.Beginner;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
 
    public static void main(String[] args) {
        
        Random random = new Random();

        int bound = 10;

        int int_random = random.nextInt(bound);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 0 and 10: ");
        int number = scanner.nextInt();

        if(number < int_random){
            System.out.println("The Number you guessed was to low!");
        } else if(number > int_random){
            System.out.println("The Number you guessed was to high!");
        } else {
            System.out.println("Congratulations! Your guess was correct!");
        }

        scanner.close();

    }

}
