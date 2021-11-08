import java.util.Scanner;
//purpose: Compute the day of week
//Main idea: dayOfWeek = (dayOfMonth + 26 * (month + 1) / 10 + yearOfTheCentury + yearOfTheCentury / 4 + year / 100 / 4 + 5 * year / 100) % 7
public class DayOfWeek {

    public static void main(String[] args) {
        //1. Get the year, month and the day of the month
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2020): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfMonth = input.nextInt();

        //2. Compute the day of week
        if(month == 1){
            year--;
            month = 13;
        }
        else if (month ==2){
            year--;
            month = 14;
        }
        int yearOfTheCentury = year % 100;
        int yearProcessed = year / 100;
        int dayOfWeek =(dayOfMonth + (26 * (month + 1)) / 10 + yearOfTheCentury + yearOfTheCentury / 4 + yearProcessed / 4 + 5 * yearProcessed) % 7;

        //3. Show the result
        System.out.print("Day of the week is ");
        switch (dayOfWeek){
            case 0:System.out.println("Saturday");break;
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("Wednesday");break;
            case 5:System.out.println("Thursday");break;
            case 6:System.out.println("Friday");break;
        }
    }

}
