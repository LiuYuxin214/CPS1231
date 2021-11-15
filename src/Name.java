import java.util.Scanner;
//Purpose:
//Main idea:
public class Name {

    public static void main(String[] args) {
        //1.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = input.nextLine();

        //2.
        int space = name.indexOf(' ');
        String first = name.substring(0,space - 1);
        String last = name.substring(space + 1);

        //3.
        System.out.print(last + " " + first);
    }

}
