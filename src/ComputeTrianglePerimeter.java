import java.util.*;
//Purpose: Compute the perimeter of triangle
//Main idea: perimeter = edge1 + edge2 + edge3
public class ComputeTrianglePerimeter {

    public static void main(String[] args) {
        //1. Get the triangle data from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges (length in double): ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        //2. Sort the edges
        double max = 0;
        double shortEdge1 = 0;
        double shortEdge2 = 0;
        if (edge1 > edge2 && edge1 > edge3) {
            max = edge1;
            shortEdge1 = edge2;
            shortEdge2 = edge3;
        }
        else if (edge2 > edge1 && edge2 > edge3) {
            max = edge2;
            shortEdge1 = edge1;
            shortEdge2 = edge3;
        }
        else if (edge3 > edge2 && edge3 > edge1) {
            max = edge3;
            shortEdge1 = edge1;
            shortEdge2 = edge2;
        }

        //3.Show the result
        if(max < shortEdge1 + shortEdge2) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        }
        else
            System.out.println("The input is invalid");

    }
}
