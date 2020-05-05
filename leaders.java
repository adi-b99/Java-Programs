//leaders in an array
import java.util.Scanner;
public class leaders{
	
	public static void main(String Args[])
	{
		System.out.println("Enter the size of the array");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		int size=1;
		for(int j=1;j<n;j++)
		{
			
			while((arr[j-1]>arr[j]))
			{
				size++;
				System.out.print(arr[j-1]);
				j++;
				
			}
			
			if((arr[j-1]<arr[j]))
			{size=1;
			}
			
		}
		//System.out.print("size=" + size);
		
		
	}
	
}