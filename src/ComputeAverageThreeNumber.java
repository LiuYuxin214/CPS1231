import java.util.Scanner;
//Purpose: compute the average of three number
//Main idea =>average = (num1+num2+num3)/3
public class ComputeAverageThreeNumber {

    public static void main(String[] args) {
        //step1: get three numbers from user
        Scanner input=new Scanner(System.in);
        System.out.println("Put three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //step2: compute the average
        double average = (num1+num2+num3)/3;

        //step3: print the result
        System.out.println("The average is "+average);

    }

}
