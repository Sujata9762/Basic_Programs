package Basic_Programs;
import java.util.*;

public class FiboSeries {

	public static void main(String args) {
		
		Scanner sc = new Scanner(System.in);
		String Original = "Hello sujata";
		sc.next();
		String Reversed = "";
		
		for(int i = Original.length()-1;i>=0;i--) {
			
			Reversed += Original.charAt(i);
		}
		System.out.println("Reversed string is :" +Reversed );
	}
}
