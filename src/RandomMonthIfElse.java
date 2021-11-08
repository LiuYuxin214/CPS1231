import java.util.Random;
//Purpose: Randomly generates an integer between 1 and 12 and displays the English month names by multi-way if-else statements
//Main idea: Random() if else if
public class RandomMonthIfElse {

    public static void main(String[] args) {
        //1. Get a random number between 1 to 12
        int Month = 0;
        Random randomNumber = new Random();
        while (Month == 0) {
            Month = randomNumber.nextInt(13);
        }

        //2. Show the corresponding month
        System.out.print("Month is ");
        if (Month == 1) {
            System.out.println("January");
        } else if (Month == 2) {
            System.out.println("February");
        } else if (Month == 3) {
            System.out.println("March");
        } else if (Month == 4) {
            System.out.println("April");
        } else if (Month == 5) {
            System.out.println("May");
        } else if (Month == 6) {
            System.out.println("June");
        } else if (Month == 7) {
            System.out.println("July");
        } else if (Month == 8) {
            System.out.println("August");
        } else if (Month == 9) {
            System.out.println("September");
        } else if (Month == 10) {
            System.out.println("October");
        } else if (Month == 11) {
            System.out.println("November");
        } else if (Month == 12) {
            System.out.println("December");
        }

    }
}
