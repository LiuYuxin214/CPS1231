import java.util.Scanner;
//Purpose: Get two numbers and show the bigger one
//Main idea: Math.max()
public class MaxNumber {

    public static void main(String[] args) {
        //1. Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        //2. Compare two numbers
        double max = Math.max(num1,num2);

        //3. Show the result
        System.out.println("The bigger number is " + max);
    }

}
