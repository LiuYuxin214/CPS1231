//Purpose: Compute pi
//Main idea: for loop 4 * (Math.pow(-1, i + 1) / (2 * i - 1))
public class ComputePi {

    public static void main(String[] args) {
        //1. Loop maximum of i
        for (int j = 10000; j <= 100000; j += 10000) {
            double pi = 0;
            double sum = 0;

            //2. Accumulation and calculate according to the formula
            for (int i = 1; i <= j; i++) {
                sum += Math.pow(-1, i + 1) / (2 * i - 1);
            }
            pi = 4 * sum;

            //3. Display the result
            System.out.println("i: " + j + " The PI is " + pi);
        }
    }

}
