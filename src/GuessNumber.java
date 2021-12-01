import java.util.Scanner;
//Purpose: randomly generates an integer between 0 and 100 and prompt the user to enter a number, and
//print corresponding message to user
//Main idea: Math.random() while loop
public class GuessNumber {

    public static void main(String[] args) {
        //1. Show tips and generates an integer between 0 and 100
        System.out.println("Guess a magic number from 0 to 100");
        int num = (int) (Math.random() * 101);

        //2. Get guess value from user
        int guess = 101;
        Scanner input = new Scanner(System.in);
        while(guess != num) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            //3. Judge the result of speculation
            if (guess > num) System.out.println("Your guess is too high");
            else if (guess < num) System.out.println("Your guess is too low");
            else System.out.println("You are awesome!");
        }
    }
}