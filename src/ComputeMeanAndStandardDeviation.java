import java.util.*;
//Purpose: prompts the user to enter 10 numbers
//and displays the mean and standard deviations of these numbers.
//Main idea: for loop
public class ComputeMeanAndStandardDeviation {

    public static void main(String[] args) {
        //1. Get 10 numbers from the user
        Scanner input = new Scanner(System.in);
        double[] num = new double[10];
        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            num[i]=input.nextDouble();
        }

        //2. Compute the mean
        double sum=0;
        for(int i=0;i<10;i++){
            sum+=num[i];
        }
        double mean = sum/10;
        System.out.println("The mean is "+ mean);

        //3. Compute the standard deviation
        double standardDeviation=0;
        double temp =0;
        for(int i=0;i<10;i++){
            temp+=(num[i]*num[i]);
        }
        standardDeviation=Math.sqrt(((temp)-(sum*sum/10))/(10-1));
        System.out.println("The standard deviation is "+standardDeviation);
    }

}
