import java.util.Scanner;
//Purpose: Compute the gratuity and total
//Main idea: Gratuity=Subtotal*GratuityRate
//           Total=Subtotal+Gratuity
public class GratuityAndTotal {

    public static void main(String[] args) {
        //1: Get the radius from the user
        System.out.print("Enter subtotal and gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double Subtotal =  input.nextDouble();
        double GratuityRate = input.nextDouble();

        // Compute the gratuity and total
        double Gratuity;
        double Total;
        Gratuity = Subtotal*(GratuityRate/100);
        Total=Subtotal+Gratuity;

        // Display results
        System.out.println("The gratuity is " + Gratuity + " total is " + Total);
    }

}