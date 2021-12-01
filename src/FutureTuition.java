//Purpose: Computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
//Main idea: for loop
public class FutureTuition {

    public static void main(String[] args) {
        //1. Set the initial value of tuition
        double tuition = 10000.0;

        //2. Calculate tuition
        for (int i = 0; i < 10; i++) {
            tuition = tuition * 1.06;
        }
        double tenYears = tuition;
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += tuition;
            tuition = tuition * 1.06;
        }

        //3. Display results
        System.out.println("Tuition in ten years is " + tenYears);
        System.out.println("The four-year tuition in ten years is " + sum);
    }

}