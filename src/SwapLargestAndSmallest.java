import java.util.*;
//Purpose:
//Main idea: 
public class SwapLargestAndSmallest {

    public static void main(String[] args) {
        //1.
        int[] num = new int[10];
        int maxIndex = 0;
        int minIndex = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }

        //2.
        int times=0;
        for(int i=0;i<10;i++){
            maxIndex = i;
            times = 0;
            for(int j=0;j<10;j++){
                times ++;
                if(num[i]<num[j]){
                    break;
                }
            }
            if(times == 10){
                break;
            }
        }
        times=0;
        for(int i=0;i<10;i++){
            minIndex = i;
            times = 0;
            for(int j=0;j<10;j++){
                times ++;
                if(num[i]>num[j]){
                    break;
                }
            }
            if(times == 10){
                break;
            }
        }

        //3.
        int temp=0;
        temp=num[maxIndex];
        num[maxIndex]=num[minIndex];
        num[minIndex]=temp;

        //4.
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]+" ");
        }

    }

}
