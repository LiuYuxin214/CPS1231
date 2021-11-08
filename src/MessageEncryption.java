import java.util.Scanner;
public class MessageEncryption {

    public static void main(String[] args) {
        //1.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the message you want to encrypt: ");
        String orgMsg = input.next();
        char char1 = orgMsg.charAt(0);
        char char2 = orgMsg.charAt(1);
        char char3 = orgMsg.charAt(2);
        System.out.println("The original Message is: " + char1 + char2 + char3);

        //2.
        int offsetValue1 = (int)(Math.random() * 11);
        int offsetValue2 = (int)(Math.random() * 11);
        int offsetValue3 = (int)(Math.random() * 11);
        char1+=offsetValue1;
        char2+=offsetValue2;
        char3+=offsetValue3;
        System.out.println("The encrypted message is " + offsetValue1 + char1 + offsetValue2 + char2 + offsetValue3 + char3);
    }

}
