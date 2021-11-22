import java.util.*;
//Purpose: Prompts the user to enter three countries and displays them in descending order
//Main idea: compareTo(s1)
public class EnterThreeCountries {

    public static void main(String[] args) {
        //1. Get three countries
        String country1,country2,country3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        country1 = input.next();
        System.out.print("Enter the second country: ");
        country2 = input.next();
        System.out.print("Enter the third country: ");
        country3 = input.next();

        //2. Order three countries
        String one,two,three,tempMax;
        int mark;
        two = " ";
        three = " ";
        if(country1.compareTo(country2) >= 0) {
            tempMax = country1;
            mark = 1;
        }
        else{
            tempMax = country2;
            mark = 2;
        }
        if(tempMax.compareTo(country3) >= 0) {
            one = tempMax;
            if(mark == 1){
                if(country2.compareTo(country3) >= 0){
                    two = country2;
                    three = country3;
                }
                else{
                    two = country3;
                    three = country2;
                }
            }
            else if(mark == 2){
                if(country1.compareTo(country3) >= 0){
                    two = country1;
                    three = country3;
                }
                else{
                    two = country3;
                    three = country1;
                }
            }

        }
        else{
            one = country3;
            two = tempMax;
            if(mark == 1) three = country2;
            else if(mark == 2) three = country1;
        }

        //3. Show three countries in decreasing order
        System.out.println("The three country in descending order are " + one + " " + two + " " + three);
    }

}