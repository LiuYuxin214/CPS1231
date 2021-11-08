import java.util.Scanner;
//Purpose: Check the temperature the user enter
//Main idea: switch
public class Temperature {

    public static void main(String[] args) {
		//1. Get the temperature from the user
		System.out.println("Enter the temperature:");
		Scanner input = new Scanner(System.in);
		int temperature = input.nextInt();

		//2. Check the temperature
		if(temperature < 30){
			System.out.println("too cold");
		}
		else if(temperature > 100){
			System.out.println("too hot");
		}
		else{
			System.out.println("just right");
		}
    }

}
