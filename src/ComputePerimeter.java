import java.util.Scanner;
//Purpose: compute Perimeter of a circle with a radius given by the user
//Main idea: 2*pi*r
public class ComputePerimeter {

    public static void main(String[] args) {
		//1: get the radius from the user
		double Perimeter;
		System.out.print("Enter a double value: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();

		//2. Compute area
		Perimeter = 2 * radius * 3.14159;

		//3. Display results
		System.out.println("The perimeter for the circle of radius " + radius + " is " + Perimeter);

    }

}