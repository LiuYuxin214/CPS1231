//Purpose: Generates three random points on a circle
//Main idea: Generate a random angle a in radians between 0 and 2π,
//as shown in Figure 4.4b and the point determined by this angle is
//(r * cos (a), r * sin (a))
public class RandomPointsOnACircle {

    public static void main(String[] args) {
        //1. Generate three random angle (a1,a2,a3) in radians between 0 and 2π
        double r = 40.0;
        double a1 = Math.toRadians(Math.random() * 361);
        double a2 = Math.toRadians(Math.random() * 361);
        double a3 = Math.toRadians(Math.random() * 361);

        //2. Display three points
        double x1 = r * Math.cos(a1);
        double y1 = r * Math.sin(a1);
        double x2 = r * Math.cos(a2);
        double y2 = r * Math.sin(a2);
        double x3 = r * Math.cos(a3);
        double y3 = r * Math.sin(a3);
        System.out.println("Three random points are");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");

        //3. Display three angles
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double A = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double B = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double C = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        System.out.println("Three random angles are");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
