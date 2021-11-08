import java.util.*;
//Purpose: Enter the first 9 digits and displays the 10-digit ISBN
//Main idea: d10 = (d1 *1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
public class ISBN {

    public static void main(String[] args) {
        //1. Get the first 9 digits from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String firstString = input.next();
        char firstChar[] = firstString.toCharArray();
        int[] firstNumber = new int[9];
        for(int i = 0; i < 9; i++){
            firstNumber[i] = (int)firstChar[i] - (int)'0';
        }

        //2. Compute the 10th digits
        int d10 = 0;
        int sum = 0;
        for(int i = 0; i < 9; i++){
            sum = sum + (firstNumber[i] * (i + 1));
        }
        d10 = sum % 11;

        //3. Displays the 10-digit ISBN
        System.out.print("The ISBN-10 number is ");
        for(int i = 0; i < 9; i++){
            System.out.print(firstNumber[i]);
        }
        if(d10 == 10){
            System.out.print("X");
        }
        else {
            System.out.print("d10");
        }
    }

}
