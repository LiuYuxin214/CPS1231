import java.util.Scanner;
//Purpose: Sort three numbers
//Main idea: Compare every two numbers
public class Sort {

    public static void main(String[] args) {
        //1. Get the weight from user
        System.out.print("Please enter three numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //2. Sort the numbers
        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3) {
                System.out.println(num3 + " " + num2 + " " + max);
            } else {
                System.out.println(num2 + " " + num3 + " " + max);
            }
        }
        if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 > num3) {
                System.out.println(num3 + " " + num1 + " " + max);
            } else {
                System.out.println(num1 + " " + num3 + " " + max);
            }
        }
        if (num3 > num2 && num3 > num1) {
            max = num3;
            if (num2 > num1) {
                System.out.println(num1 + " " + num2 + " " + max);
            } else {
                System.out.println(num2 + " " + num1 + " " + max);
            }
        }

    }
}
