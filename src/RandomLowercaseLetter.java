//Purpose:  generate a random lowercase letter without selection
//Main idea: Random char
public class RandomLowercaseLetter {

    public static void main(String[] args) {
            //1. Generate a ASCII
            int RandomLowercase = (int) (Math.random() * 26 + (int)'a');
            char lowercase = (char) RandomLowercase;

            //2.Show this lowercase
            System.out.println("The random lowercase lowercase is " + lowercase);
    }
}
