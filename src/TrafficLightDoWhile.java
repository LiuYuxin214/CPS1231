//Purpose: simulate one complete cycle of Traffic Light
//Main idea: do-while loop
public class TrafficLightDoWhile {

    public static void main(String[] args) {
        //1. display "Red Light"
        int i = 0;
         do{
            System.out.println("Red Light");
            i++;
         }while(i < 5);

        //2. display "Green Light"
        i = 0;
        do{
            System.out.println("Green Light");
            i++;
        }while(i < 3);

        //3. display "Yellow Light"
        System.out.println("Yellow Light");
    }

}
