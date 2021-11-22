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
        char student[] = enter.toCharArray();

        //2. Judge whether there is an input error
        if(!((student[0]=='I'||student[0]=='C'||student[0]=='A') && (student[1]=='1'||student[1]=='2'||student[1]=='3'||student[1]=='4'))) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        //3. Display major
        if(student[0] == 'I') System.out.print("Information Management ");
        else if(student[0] == 'C') System.out.print("Computer Science ");
        else if(student[0] == 'A') System.out.print("Accounting ");

        //4. Display status
        if(student[1] == '1') System.out.print("Freshman");
        else if(student[1] == '2') System.out.print("Sophomore");
        else if(student[1] == '3') System.out.print("Junior");
        else if(student[1] == '4') System.out.print("Senior");

    }

}
