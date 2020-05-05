import java.util.Scanner;
public class largestofthree{
	public static void main(String Args[])
	{
	System.out.println("Enter three numbers ");
	Scanner s= new Scanner(System.in);
	int a= s.nextInt();
	int b= s.nextInt();
	int c= s.nextInt();
	//int
	
	if (a>b && a>c)
	{
		System.out.println("Your answer is: " + a);
		
	}
	
	else if (b>a && b>c)
	{
		System.out.println("Your answer is: " + b);
		
	}
	
	else 
	{
		System.out.println("Your answer is: " + c);
		
	}
	}
}
	
	