import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Guess a magic number from 0 to 100");
        System.out.println("");

        boolean x = false;
        while(x == false) {
            double num = Math.random() * 101;
            int num1 = (int) num;
            System.out.print("Enter your guess: ");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();

            if (guess > num1) System.out.println("Your guess is too high");
            else if (guess < num1) System.out.println("Your guess is too low");
            else if (guess == num1) {
                System.out.println(num1);
                x = true;
            }
        }
    }

}
