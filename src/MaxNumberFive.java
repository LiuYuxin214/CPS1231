import java.util.Scanner;
//Purpose: Get five numbers and show the biggest one
//Main idea: Math.max()
public class MaxNumberFive {

    public static void main(String[] args) {
        //1. Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        //2. Compare five numbers
        double max = Math.max(num1,num2);
        max = Math.max(max,num3);
        max = Math.max(max,num4);
        max = Math.max(max,num5);

        //3. Show the result
        System.out.println("The biggest number is " + max);
    }

}
