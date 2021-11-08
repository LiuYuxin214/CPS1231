import java.util.Random;
//Purpose:  generate a random lowercase letter
//Main idea: Random char
public class RandomLowercaseLetterLoop {

    public static void main(String[] args) {
        //1. Generate a ASCII
        Random randomNumber = new Random();
        for(int i=0;i<=100;i++) {
            int RandomLowercase = randomNumber.nextInt(123);
            while (RandomLowercase < 97) RandomLowercase = randomNumber.nextInt(123);
            char letter = (char) RandomLowercase;

            //2.Show this letter
            System.out.println("The random lowercase letter is " + letter);
        }
    }

}
