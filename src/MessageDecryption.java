import java.util.Scanner;
//Purpose: decrypt the given message
//Main idea: Use Math.random() and orgMsg.charAt()
public class MessageDecryption {

    public static void main(String[] args) {
        //1. Get the message from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the message you want to decrypt: ");
        String orgMsg = input.next();
        char char1 = orgMsg.charAt(0);
        char char2 = orgMsg.charAt(1);
        char char3 = orgMsg.charAt(2);
        char char4 = orgMsg.charAt(3);
        char char5 = orgMsg.charAt(4);
        char char6 = orgMsg.charAt(5);
        System.out.println("The original Message is: " + char1 + char2 + char3 + char4 + char5 + char6);

        //2.Encrypt the message
        int offsetValue1 = (int)(char1 - (int)'0');
        int offsetValue2 = (int)(char3 - (int)'0');
        int offsetValue3 = (int)(char5 - (int)'0');
        char2-=offsetValue1;
        char4-=offsetValue2;
        char6-=offsetValue3;
        System.out.println("The decrypted message is " + char2 + char4 + char6);
    }

}
