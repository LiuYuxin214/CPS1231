import java.util.*;
//Purpose:
//Main idea: 
public class TemperatureMethod {
    public static double c2f(double celTemp){
        double result;
        if(celTemp < -273.15) {
            System.out.println("Invalid Temperature");
            return -459.67;
        }
        else result = celTemp * 9 / 5 + 32;
        return result;
    }

    public static void main(String[] args) {
        //1.


        //2.


        //3.

    }

}
