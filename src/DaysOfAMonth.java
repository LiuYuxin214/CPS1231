import java.util.*;
//Purpose: prompts the user to enter the year and the first three letters of a month name
//and displays the number of days in the month
//Main idea: if month == Feb judge leap year else display directly
public class DaysOfAMonth {

    public static void main(String[] args) {
        //1. Get year and month
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month (first three letters with the first letter in uppercase): ");
        String month = input.next();

        //2. display the number of days in the month and Judge whether leap years need to be judged
        boolean judgeLeapYear = false;
        if(month.equals("Jan")) System.out.println("Jan " + year + " has 31 days");
        else if(month.equals("Feb")) judgeLeapYear = true;
        else if(month.equals("Mar")) System.out.println("Mar " + year + " has 31 days");
        else if(month.equals("Apr")) System.out.println("Apr " + year + " has 30 days");
        else if(month.equals("May")) System.out.println("May " + year + " has 31 days");
        else if(month.equals("Jun")) System.out.println("Jun " + year + " has 30 days");
        else if(month.equals("Jul")) System.out.println("Jul " + year + " has 31 days");
        else if(month.equals("Aug")) System.out.println("Aug " + year + " has 31 days");
        else if(month.equals("Sep")) System.out.println("Sep " + year + " has 30 days");
        else if(month.equals("Oct")) System.out.println("Oct " + year + " has 31 days");
        else if(month.equals("Nov")) System.out.println("Nov " + year + " has 30 days");
        else if(month.equals("Dec")) System.out.println("Dec " + year + " has 31 days");
        else System.out.println(month + " is not a correct month name");

        //3. Judge leap year
        if(judgeLeapYear == true){
            if((year % 100 == 0 && year % 400 == 0)||(year % 4 == 0 && !(year % 100 == 0))) System.out.println("Feb " + year + " has 29 days");
            else System.out.println("Feb " + year + " has 28 days");
        }
    }
}
