import java.util.Random;
import java.util.Scanner;
//Purpose: make a subtraction and judge the answer from user
//Main idea: Random if
public class PracticeSubtractionWithMessage {

    public static void main(String[] args) {
        //1.make a question
        Random randomNumber = new Random();
        int num1 = randomNumber.nextInt(10);
        int num2 = randomNumber.nextInt(10);//  (int)(Math.random()*10)
        if(num2 > num1){
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int result = num1 - num2;

        //2.Show the question and get the answer from user
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + " - " + num2 + "? ");
        int answer = input.nextInt();

        //3.Judge whether the user answers the question correctly
        if(answer == result){
            int MessageRight = randomNumber.nextInt(3);
            switch (MessageRight){
                case 0: System.out.println("Excellent!");break;
                case 1: System.out.println("Correct!");break;
                case 2: System.out.println("Way to go!");break;
            }
        }
        if(answer != result){
            int MessageWrong = randomNumber.nextInt(3);
            switch (MessageWrong){
                case 0: System.out.println("Incorrect!");break;
                case 1: System.out.println("Wrong!");break;
                case 2: System.out.println("Not right!");break;
            }
        }

    }

}
