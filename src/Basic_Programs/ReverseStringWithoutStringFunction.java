package Basic_Programs;

public class ReverseStringWithoutStringFunction {

	public static void main(String args[]) {

		String str1 = "Sujata";

		for (int i = 0; i <= str1.length() - 1; i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("");

		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}

	}
}
