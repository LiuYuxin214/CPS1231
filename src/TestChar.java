public class TestChar {

    public static void main(String[] args) {
		int i = 0;
		char j = '0';
		System.out.println(i);
		System.out.println(j);
		System.out.println(j == i);
		System.out.println(j - i);
		System.out.println(Character.getNumericValue(j) == i);
    }

}
