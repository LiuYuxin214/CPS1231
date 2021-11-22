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
        System.out.println("Three random points are");
        System.out.println("(" + r * Math.cos(a1) + ", " + r * Math.sin(a1) +")");
        System.out.println("(" + r * Math.cos(a2) + ", " + r * Math.sin(a2) +")");
        System.out.println("(" + r * Math.cos(a3) + ", " + r * Math.sin(a3) +")");
    }

}
