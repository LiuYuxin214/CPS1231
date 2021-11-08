import java.util.Scanner;
//Purpose:Use the following function to calculate the cost (in dollars) of
//shipping based on the weight of the package (in pounds)
//Main idea:if <= &&
public class CalculateCost {

    public static void main(String[] args) {
        //1. Get the weight from user
        System.out.print("Please enter the weight of the package: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();

        //2. Calculate the cost
        if(weight > 0 && weight <= 2){
            System.out.println(2.5);
        }
        else if(weight > 2 && weight <= 4){
            System.out.println(4.5);
        }
        else if(weight > 4 && weight <= 10){
            System.out.println(7.5);
        }
        else if(weight > 10 && weight <= 20){
            System.out.println(10.5);
        }
        else{
            System.out.println("The package cannot be shipped.");
        }
    }

}