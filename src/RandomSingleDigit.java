//Purpose:  generate a random uppercase letter without selection
//Main idea: Random char
public class RandomSingleDigit {

    public static void main(String[] args) {
        //1. Generate a ASCII
        int RandomSingleDigit = (int) (Math.random() * 10 + (int)'0');
        char singleDigit = (char) RandomSingleDigit;

        //2.Show this singleDigit
        System.out.println("The random single digit is " + singleDigit);
    }

}
