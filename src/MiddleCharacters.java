import java.util.Scanner;
//Purpose: Display the middle character of a string
//Main idea: 
public class MiddleCharacters {
	//Signature: middleCharacters: String -> String
	//Purpose: Return the middle character of a string
	//Examples:
	// 			middleCharacters("abc") -> b
	//          middleCharacters("abcd") -> bc
	public static String middleCharacters (String str){
		int length = str.length();
		String result = "";
		if (length % 2 == 0) {
			result = str.substring(length / 2 - 1, length / 2 + 1);
		}
		else if (length % 2 != 0) {
			char temp = str.charAt(length / 2);
			result = temp + "";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String enter = input.next();
		System.out.println(middleCharacters(enter));
	}
}