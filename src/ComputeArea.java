import java.util.Scanner;
//Purpose: compute area of a circle with a radius given by the user
//Main idea: pi*r*r
public class ComputeArea {

    public static void main(String[] args) {
            //step1: Get the radius from the user
            //double radius; // Declare radius
            double area = 0; // Declare area
            System.out.print("Enter a double value: ");
            Scanner input = new Scanner(System.in);
            double radius = input.nextDouble();
            // Assign a radius
            //radius = 20; // New value is radius

            //step2: Compute area
            if(radius>0) {
                area = radius * radius * 3.14159;

                //step3: Display results
                System.out.println("The area for the circle of radius " + radius + " is " + area);
            }


    }

}
