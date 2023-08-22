package Basic_Programs;

public class RevString {

	public static void main(String args) {

		String OriginString = "Hello sujata";
		String ReverseString = " ";

		for (int i = OriginString.length() - 1; i >= 0; --i) {

			{
				ReverseString += OriginString.charAt(i);

			}

			System.out.println("ReverseString");
		}
	}
}
