import java.util.Scanner;
//Purpose:Compare two numbers
//Main idea:if else >
public class LargerNumber {

    public static void main(String[] args) {
        //1. Get the number from user
        System.out.print("Please enter two numbers: ");
        Scanner input=new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //2. Compare two numbers
        if(num1>=num2){
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }

}