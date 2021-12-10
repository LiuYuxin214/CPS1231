import java.util.*;

//Purpose:
//Main idea: 
public class ShiftMethod {
    public static int[] shiftMethod(int num[]){
        int length=num.length;
        int first = num[0];
        for(int i=0;i<length-1;i++){
            num[i]=num[i+1];
        }
        num[length-1]=first;
        return num;
    }

    public static void main(String[] args) {
        //1.


        //2.


        //3.

    }

}
