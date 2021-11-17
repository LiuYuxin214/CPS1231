import java.util.Scanner;
//Purpose: randomly generates an integer between 0 and 100 and prompt the user to enter a number, and
//print corresponding message to user
//Main idea: Math.random() while loop
public class GuessNumber {

    public static void main(String[] args) {
        //1. Show tips
        System.out.println("Guess a magic number from 0 to 100");
        System.out.println("");

        //2. Get guess value from user
        boolean mark = false;
        while(mark == false) {
            int num1 = (int) (Math.random() * 101);
            System.out.print("Enter your guess: ");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();

            //3. Judge the result of speculation
            if (guess > num1) System.out.println("Your guess is too high");
            else if (guess < num1) System.out.println("Your guess is too low");
            else if (guess == num1) {
                System.out.println(num1);
                mark = true;
            }
        }
    }
}