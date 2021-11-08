//Purpose: Generate a random password
//Main idea: Use Random loop and character array
public class RandomPassword {

    public static void main(String[] args) {
        //1. Generate some random characters
        char[] tempArr = new char[11];
        for(int i = 0; i <= 2; i++) {
            tempArr[i] = (char) (Math.random() * 26 + 97);
        }
        for(int i = 3; i <= 4 ; i++) {
            tempArr[i] = (char) (Math.random() * 26 + 65);
        }
        for(int i = 5; i <= 10 ; i++) {
            tempArr[i] = (char) (Math.random() * 10 + 48);
        }

        //2. Generate some random serial number
        int[] SerialNumber = new int[11];
        for(int i = 0; i <= 10; i++) {
            SerialNumber[i] = (int) (Math.random() * 11);
            for(int j = 0; j < i; j++) {
                if (SerialNumber[i] == SerialNumber[j]) i--;
            }
        }

        //3. Sort with random serial number
        char[] password = new char[11];
        for(int i = 0; i <= 10; i++) password[i] = tempArr[SerialNumber[i]];

        //4. Show the random password
        System.out.print("The random password is ");
        for(int i = 0; i <= 10; i++) System.out.print(password[i]);
    }

}
