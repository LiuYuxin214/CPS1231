//Purpose: display the population for each of the next five years
//Main idea: Use /
public class Population {

    public static void main(String[] args) {
        int seconds;
        final int CURRENT_POPULATION = 312032486;
        double birth;
        double death;
        double newImmigrant;
        double population;
        for(int i = 1; i <= 5; i++){
            //1. compute the seconds
            seconds = i * 365 * 24 * 60 * 60;
            //2. compute the number of birth, death and new immigrant
            birth = seconds / 7.0;
            death = seconds / 13.0;
            newImmigrant = seconds / 45.0;
            //3. compute the population
            population = CURRENT_POPULATION + birth - death + newImmigrant;
            //4. display the population
            System.out.println(population);
        }

    }

}
