import java.util.Scanner;
//purpose: compute the future investment value
//Main idea = FIV=IMA*Math.pow(1+AIR/100/12,years*12)
public class FutureInvestmentValue {

    public static void main(String[] args) {
        //step1: get data of the investment from user
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the investment amount, for example 120000.95: ");
        double IMA = input.nextDouble();
        System.out.print("Enter annual investment rate, for example 8.25: ");
        double AIR = input.nextDouble();
        System.out.print("Enter number of years as a integer, for example 5: ");
        int years = input.nextInt();

        //step2: compute the future investment value
        double FIV=IMA*Math.pow(1+AIR/100/12,years*12);

        //step3: print the result
        System.out.println("Future value is "+FIV);
    }
}
