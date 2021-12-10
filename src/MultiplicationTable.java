//Purpose:
//Main idea: 
public class MultiplicationTable {

    public static void main(String[] args) {
        //1.
        System.out.print("   ");
        for (int i = 1; i <= 9; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.print("-----------------------------");
        System.out.println();

        //2.
        for(int i = 1; i <= 9; i++){
            System.out.print(i+"| ");
            for(int j = 1; j <= 9; j++){
                if(i*j<=9) System.out.print(" " + i * j + " ");
                else System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}


