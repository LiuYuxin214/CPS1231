import java.util.*;
//Purpose:
//Main idea: 
public class MiddleCharacter {

    public static String mc(String str){
        String result;
        if(str.length() % 2 == 0){
            int midlength = str.length() / 2;
            result = str.substring(midlength - 1, midlength + 1);
            return result;
        }
        else{

            int midlength = str.length() / 2 + 1;
            result = str.substring(midlength - 1,midlength);
            return result;
        }


    }

    public static void main(String[] args) {
        //1.
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        //2.
        str = mc(str);

        //3.
        System.out.println(str);

    }

}
