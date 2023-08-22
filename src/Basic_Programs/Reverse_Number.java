package Basic_Programs;

public class Reverse_Number {

	public static void main(String[] args) {

		int num = 153;
		int RevNum = 0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem  = i %10;
			RevNum = RevNum*10 + (rem);
			
		}
		System.out.println(RevNum);
	}

}
