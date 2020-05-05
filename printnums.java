//Program to print the code of the following
public class printnums{

public static int prints(int n)
{
	System.out.println(n);
	
if(n==1)
{
	return (n);
}

return (prints(n-1));
}

public static void main(String Args[])
{
int n=10;
prints(n);


}

}