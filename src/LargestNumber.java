import java.util.*;
//Purpose:
//Main idea: 
public class LargestNumber {

    public static void main(String[] args) {
        //1.
        int[] num = new int[10];
        int max = 0;
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }

        //2.
        int times=0;
        for(int i=0;i<10;i++){
            max = num[i];
            index = i+1;
            times = 0;
            for(int j=0;j<10;j++){
                times ++;
                if(max<num[j]){
                    break;
                }
            }
            if(times == 10){
                break;
            }
        }

        //3.
        System.out.println(max);
        System.out.println(index);
    }

}
