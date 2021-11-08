//Purpose:  generate a random uppercase letter without selection
//Main idea: Random char
public class RandomSingleDigit {

    public static void main(String[] args) {
        //1. Generate a ASCII
        int RandomUppercase = (int) (Math.random() * 26 + (int)'0');
        char letter = (char) RandomUppercase;

        //2.Show this letter
        System.out.println("The random uppercase letter is " + letter);
    }

}
