//Purpose: Generate a random double numeric value with [0,10)
//Main idea: Using Math.random()%10
public class Random {

    public static void main(String[] args) {
        //1. Generate a random double numeric value with [0,10)
        double num;
        num = Math.random() * 10;

        //2. Show the number
        System.out.println("The random double numeric value is " + num);
    }

}
