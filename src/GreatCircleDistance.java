import java.util.Scanner;
//Purpose: compute the great circle distance
//Main idea: d = R * arccos((sin(x1))  * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
public class GreatCircleDistance {

    public static void main(String[] args) {
		//1.Get the data from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double dx1 = input.nextDouble();
        double dy1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double dx2 = input.nextDouble();
        double dy2 = input.nextDouble();
        double rx1 = Math.toRadians(dx1);
        double ry1 = Math.toRadians(dy1);
        double rx2 = Math.toRadians(dx2);
        double ry2 = Math.toRadians(dy2);

        //2.
        final double R = 6371.01;
        double d = R * Math.acos((Math.sin(rx1)) * Math.sin(rx2) + Math.cos(rx1) * Math.cos(rx2) * Math.cos(ry1 - ry2));
        System.out.println("The distance is " + d + " km");
    }

}
