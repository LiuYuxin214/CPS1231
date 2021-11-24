import java.util.*;
//Purpose:
//Main idea: 
public class Sum {

    public static int sum(int num1, int num2){
        int result = 0;
        for(;num1<=num2;num1++){
            result += num1;
        }
        return result;
    }

    public static void main(String[] args) {
        //1.
        int num1 = 1, num2 = 10;
        int num3 = 20, num4 = 30;
        int num5 = 35, num6 = 45;

        //2.
        int sum1 = sum(num1, num2);
        int sum2 = sum(num3, num4);
        int sum3 = sum(num5, num6);

        //3.
        System.out.printf("Sum from %d to %d is %d\n", num1, num2, sum1);
        System.out.printf("Sum from %d to %d is %d\n", num3, num4, sum2);
        System.out.printf("Sum from %d to %d is %d", num5, num6, sum3);

    }

}
