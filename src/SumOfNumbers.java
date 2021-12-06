import java.util.Scanner;
//Purpose:
//Main idea: 
public class SumOfNumbers {

    public static void main(String[] args) {
        //1.
        int[] num = new int[20];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        for (int i = 0; i < 2; i++) {
            num[i] = input.nextInt();
            sum += num[i];
        }
        System.out.println("The sum of two entered numbers is " + sum);

        //2.
        sum = 0;
        System.out.print("Please enter six numbers: ");
        for (int i = 0; i < 6; i++) {
            num[i] = input.nextInt();
            sum += num[i];
        }
        System.out.println("The sum of six entered numbers is " + sum);

        //3.
        sum = 0;
        System.out.print("Please enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
            sum += num[i];
        }
        System.out.println("The sum of ten entered numbers is " + sum);

        //4.
        sum = 0;
        System.out.print("Please enter twenty numbers: ");
        for (int i = 0; i < 20; i++) {
            num[i] = input.nextInt();
            sum += num[i];
        }
        System.out.println("The sum of twenty entered numbers is "+sum);
    }

}
