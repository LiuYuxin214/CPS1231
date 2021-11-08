import java.util.Scanner;
import java.util.Random;
//Purpose: Play the popular scissor–rock–paper game
//Main idea: Random switch
public class ScissorRockPaper {

    public static void main(String[] args) {
        //1.Get the input from user
        System.out.print("scissor (0), rock (1), paper(2): ");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();

        //2.Generate a random value with {0,1,2}
        Random randomNumber = new Random();
        int computer = randomNumber.nextInt(3);

        //3.Show the computer and user selections
        switch (computer) {
            case 0 :
                System.out.print("The computer is scissor. ");
                break;
            case 1 :
                System.out.print("The computer is rock. ");
                break;
            case 2 :
                System.out.print("The computer is paper. ");
                break;
        }
        switch (user) {
            case 0 :
                System.out.print("You are scissor. ");
                break;
            case 1 :
                System.out.print("You are rock. ");
                break;
            case 2 :
                System.out.print("You are paper. ");
                break;
        }

        //4.Judge who is winner
        if(computer == user){
            System.out.print("Draw");
            System.exit(0);
        }
        switch (computer) {
            case 0 :
                switch (user){
                    case 1 :
                        System.out.print("You win.");
                        break;
                    case 2 :
                        System.out.print("Computer win.");
                        break;
                }
                break;
            case 1 :
                switch (user){
                    case 2 :
                        System.out.print("You win.");
                        break;
                    case 0 :
                        System.out.print("Computer win.");
                        break;
                }
                break;
            case 2 :
                switch (user){
                    case 0 :
                        System.out.print("You win.");
                        break;
                    case 1 :
                        System.out.print("Computer win.");
                        break;
                }
                break;


        }
    }

}
