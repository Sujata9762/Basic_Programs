package Basic_Programs;

public class Duplicate_array {

	public static void main(String[] args) {

		int arr[] = {3,7,8,6,5,4,3,2,1,1,2,3,4,5};
		System.out.println("Duplicate elements in given array are:");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
				
			}
		}
	}

}
