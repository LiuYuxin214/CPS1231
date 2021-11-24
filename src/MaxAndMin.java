import java.util.*;

//Purpose:
//Main idea: 
public class MaxAndMin {

	public static double max(double num1, double num2){
        double result;
        if(num1 >= num2) result = num1;
        else result = num2;
        return result;
    }
    public static double min(double num1, double num2){
        double result;
        if(num1 <= num2) result = num1;
        else result = num2;
        return result;
    }
    public static double max3(double num1, double num2, double num3){
        double result;
        double temp;
        if(num1 >= num2) temp = num1;
        else temp = num2;
        if(temp >= num3) result = temp;
        else result = num3;
        return result;
    }
    public static double min3(double num1, double num2, double num3){
        double result;
        double temp;
        if(num1 <= num2) temp = num1;
        else temp = num2;
        if(temp <= num3) result = temp;
        else result = num3;
        return result;
    }

    public static void main(String[] args) {
        //1.


        //2.


        //3.

    }

}
