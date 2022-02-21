import java.util.Scanner;
//Purpose: Check the number whether it is from (5,26)
//Main idea: Math.max Math.min
public class Boundary {

    public static void main(String[] args) {
        //1. Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double num = input.nextDouble();

        //2. Check the number and show the number
        final double MAX_BOUNDARY = 26.0;
        final double MIN_BOUNDARY = 5.0;
        double temp = Math.min(num,MAX_BOUNDARY);
        double result = Math.max(temp,MIN_BOUNDARY);
        System.out.println("The number is " + result);
        }
}
