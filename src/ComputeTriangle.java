import java.util.Scanner;
import java.math.*;
//Purpose: compute the area and volume of a triangle
//Main idea =>area = sqrt(3)/4 * sides * sides
//         volume = area * height
public class ComputeTriangle {

    public static void main(String[] args) {

        //1. get the triangle data from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of sides and height of the equilateral triangle");
        double sides = input.nextDouble();
        double height = input.nextDouble();

        //2. Compute the area and volume of a triangle
        double area = Math.sqrt(3)/4.0 * sides * sides;
        double volume = area * height;

        //3. Display results
        System.out.println("The area is " + area);
        System.out.println("The volume of triangle prism is " + volume);
    }

}