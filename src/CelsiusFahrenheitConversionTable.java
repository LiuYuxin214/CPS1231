//Purpose: Displays a celsius fahrenheit conversion table
//Main idea: for loop and fahrenheit = celsius * 9/5 + 32
public class CelsiusFahrenheitConversionTable {

    public static void main(String[] args) {
        //1. Display the head of the table
        System.out.println("Celsius       Fahrenheit");
        System.out.println("------------------------");

        //2. Display data
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + "           ");
            if (i < 100) System.out.print(" ");
            if (i < 10) System.out.print(" ");
            System.out.print(i * 9.0 / 5.0 + 32.0);
            System.out.println();
        }
    }
}
