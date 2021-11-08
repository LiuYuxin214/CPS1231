import java.util.Scanner;
//purpose:Convert miles to kilometers
//Main idea:1 mile = 1.6 kilometers
public class ConvertMilesToKilometers {

	public static void main(String[] args) {

		//1. Get the miles from the user
		System.out.print("Enter a double value: ");
		Scanner input = new Scanner(System.in);
		double miles = input.nextDouble();

		//2. Convert
		double kilometers = miles * 1.6;

		//3. Display results
		System.out.println("The kilometers for the miles " + miles + " are " + kilometers);

	}

}