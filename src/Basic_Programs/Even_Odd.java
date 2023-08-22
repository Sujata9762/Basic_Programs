package Basic_Programs;
import java.util.*;

public class Even_Odd {

	public static void main(String args[]) {
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println("Given Number is Even");
		else
			System.out.println("Given Number is odd");
	}
}
