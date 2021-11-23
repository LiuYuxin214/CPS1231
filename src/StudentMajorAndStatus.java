import java.util.*;
//Purpose: prompts the user to enter two characters and displays the major and status represented in the characters
//Main idea: if-else
public class StudentMajorAndStatus {

    public static void main(String[] args) {
        //1. Get the input from the user
        Scanner input = new Scanner(System.in);
        String enter;
        System.out.print("Enter two characters: ");
        enter = input.next();
        char major = enter.charAt(0);
        char status = enter.charAt(1);

        //2. Judge whether there is an input error
        if(!((major=='I'||major=='C'||major=='A') && (status=='1'||status=='2'||status=='3'||status=='4'))) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        //3. Display major
        if(major == 'I') System.out.print("Information Management ");
        else if(major == 'C') System.out.print("Computer Science ");
        else if(major == 'A') System.out.print("Accounting ");

        //4. Display status
        if(status == '1') System.out.print("Freshman");
        else if(status == '2') System.out.print("Sophomore");
        else if(status == '3') System.out.print("Junior");
        else if(status == '4') System.out.print("Senior");

    }

}
