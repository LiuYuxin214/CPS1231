import java.util.Scanner;
//Purpose: prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles
//         and determines whether the second rectangle is inside the first or overlaps with the first
//Main idea: if else abs
public class TwoRectangles {

    public static void main(String[] args) {
		//1. Get the data from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		//2. Compute the left,right,up and down of each rectangle
		double edgeLeft1 = x1 - (w1 / 2);
		double edgeRight1 = x1 + (w1 / 2);
		double edgeUp1 = y1 + (h1 / 2);
		double edgeDown1 = y1 - (h1 / 2);
		
		double edgeLeft2 = x2 - (w2 / 2);
		double edgeRight2 = x2 + (w2 / 2);
		double edgeUp2 = y2 + (h2 / 2);
		double edgeDown2 = y2 - (h2 / 2);

		//3. Check it and show the result
		if(Math.abs(edgeLeft1) >= Math.abs(edgeLeft2) && Math.abs(edgeRight1) >= Math.abs(edgeRight2) && Math.abs(edgeUp1) >= Math.abs(edgeUp2) && Math.abs(edgeDown1) >= Math.abs(edgeDown2)){
			System.out.println("r2 is inside r1");
		}
		else if(Math.abs(edgeRight1)<Math.abs(edgeLeft2)){
			System.out.println("r2 does not overlap r1");
		}
		else if(Math.abs(edgeLeft1) > Math.abs(edgeRight2)){
			System.out.println("r2 does not overlap r1");
		}
		else if(Math.abs(edgeDown1) > Math.abs(edgeUp2)){
			System.out.println("r2 does not overlap r1");
		}
		else if(Math.abs(edgeDown2) > Math.abs(edgeUp1)){
			System.out.println("r2 does not overlap r1");
		}
		else{
			System.out.println("r2 overlaps r1");
		}
    }

}
