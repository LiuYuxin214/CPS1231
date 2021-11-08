import java.util.Scanner;
//purpose: compute the distance from two points
//Main idea => sqrt(pow((x2-x1),2)+pow((y2-y1),2))
public class Distance {

    public static void main(String[] args) {
        //step1: get points from user
        Scanner input=new Scanner(System.in);
        System.out.print("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //step2: compute the distance
        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        //step3: print the result
        System.out.println("The distance is "+distance);

    }

}
