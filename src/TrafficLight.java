//Purpose: simulate one complete cycle of Traffic Light
//Main idea: while loop
public class TrafficLight {

    public static void main(String[] args) {
        //1. display "Red Light"
        int i = 0;
        while(i < 5) {
            System.out.println("Red Light");
            i++;
        }

        //2. display "Green Light"
        i = 0;
        while(i < 3){
            System.out.println("Green Light");
            i++;
        }

        //3. display "Yellow Light"
        System.out.println("Yellow Light");
    }

}
