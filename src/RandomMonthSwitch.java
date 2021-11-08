import java.util.Random;
//Purpose: Randomly generates an integer between 1 and 12 and displays the English month names by switch statements
//Main idea: Random() if else if
public class RandomMonthSwitch {

    public static void main(String[] args) {
        //1. Get a random number between 0 to 11
        int Month = 0;
        Random randomNumber = new Random();
        while (Month == 0) {
            Month = randomNumber.nextInt(13);
        }

        //2. show the corresponding month
        System.out.print("Month is ");
        switch (Month){
            case 1: System.out.print("January");
                    break;
            case 2: System.out.print("February");
                break;
            case 3: System.out.print("March");
                break;
            case 4: System.out.print("April");
                break;
            case 5: System.out.print("May");
                break;
            case 6: System.out.print("June");
                break;
            case 7: System.out.print("July");
                break;
            case 8: System.out.print("August");
                break;
            case 9: System.out.print("September");
                break;
            case 10: System.out.print("October");
                break;
            case 11: System.out.print("November");
                break;
            case 12: System.out.print("December");
                break;

        }

    }
}
