import java.util.Random;
//Purpose:  generate a random lowercase letter without selection
//Main idea: Random char
public class RandomLowercaseLetter {

    public static void main(String[] args) {
            //1. Generate a ASCII
            int RandomLowercase = (int) (Math.random() * 26 + 97);
            char letter = (char) RandomLowercase;

            //2.Show this letter
            System.out.println("The random lowercase letter is " + letter);
    }
}
