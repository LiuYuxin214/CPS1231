//Purpose:
//Main idea: 
public class AverageOf100RandomNumbers {

    public static void main(String[] args) {
        //1.
        int[] num = new int[600];
        int average = 0;
        for (int i = 0; i < 100; i++) {
            num[i] = (int)(Math.random()*100);
            average += num[i];
        }

        //2.
        average = average/100;

        //3.
        System.out.println("The average of two entered numbers is "+average);
    }

}
