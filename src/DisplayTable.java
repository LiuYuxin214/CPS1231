//Purpose: Displays the table
//Main idea: Use circulate and array
public class DisplayTable {

    public static void main(String[] args) {

        //1. Print the identification
        System.out.println("     a          b      Middle Point");

        //2. Build the array
        double[] Al = new double[]{0, 1, 2, 3, 4};
        double[] Ar = new double[]{0, 4, 7, 9, 11};
        double[] Bl = new double[]{2, 4, 6, 10, 12};
        double[] Br = new double[]{1, 2, 3, 5, 7};

        //3. Display the table
        for (int i = 0; i <= 4; i++) {
            System.out.println("(" + Al[i] + ", " + Ar[i] + ")"+"  "
                    +"(" + Bl[i] + ", " + Br[i] + ")"+"  "
                    +"(" + (Al[i]+Bl[i])/2 + ", " + (Ar[i]+Br[i])/2 + ")");

        }

    }
}