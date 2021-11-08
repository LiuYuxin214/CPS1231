//Purpose: Generate a random password
//Main idea: Use Math.random
public class RandomPassword5CharacterLong {

    public static void main(String[] args) {
        //1. Generate some random characters
        int RandomUppercase1 = (int) (Math.random() * 26 + (int)'A');
        char uppercase1 = (char) RandomUppercase1;
        int RandomLowercase2 = (int) (Math.random() * 26 + (int)'a');
        char lowercase2 = (char) RandomLowercase2;
        int RandomSingleDigit3 = (int) (Math.random() * 10 + (int)'0');
        char singleDigit3 = (char) RandomSingleDigit3;
        int RandomUppercase4 = (int) (Math.random() * 26 + (int)'A');
        char uppercase4 = (char) RandomUppercase4;
        int RandomSingleDigit5 = (int) (Math.random() * 10 + (int)'0');
        char singleDigit5 = (char) RandomSingleDigit5;

        //2. Show the random password
        System.out.println(uppercase1 + "" + lowercase2 + singleDigit3 + uppercase4 + singleDigit5);
    }

}
