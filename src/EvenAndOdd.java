import java.util.Scanner;
//Purpose:Judge whether a number is odd or even
//Main idea:if else %2
public class EvenAndOdd {

    public static void main(String[] args) {
        //1. Get the number from user
        System.out.print("Please enter the integer number: ");
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();

        //2. Judge whether the number is odd or even
        if(num%2==1){
            System.out.println(num+" is Odd Number");
        }
        else {
            System.out.println(num+" is Even Number");
        }
    }

}
