import java.util.*;
//Purpose: Prompts the user to enter an integer from 1 to 15 and displays a pyramid
//Main idea: for loop
public class Pyramid {

    public static void main(String[] args) {
        //1. Get the number of line from user
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = input.nextInt();

        //2. Show the pyramid
        int spaceAct = 0;
        int space =0;
        for(int j = num; j >=1 ; j--) {
            spaceAct = space;
            while(spaceAct>0){
                System.out.print(" ");
                spaceAct--;
            }
            for (int i = j; i >= 1; i--) {
                System.out.print(i);
                System.out.print("  ");
            }
            for (int i = 2; i <= j; i++) {
                System.out.print(i);
                System.out.print("  ");
            }
            System.out.println();
            space+=3;
        }
    }

}
