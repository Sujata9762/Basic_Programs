package Basic_Programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Sujata";
		String ReversedString ="";
		char ch;
		
		System.out.println("Original String :" +str);
		
		for(int i =0;i<str.length();i++) 
		{
			ch=str.charAt(i);
			ReversedString = ch+ReversedString;
		}
		
		System.out.println("Reversed string is :" +ReversedString);
	}

}
