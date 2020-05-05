//check number in an array
public class checknum{
public static boolean checknum(int arr[],int n)
{
if(arr.length==0)
		{
			return false;
		}

	int[] arr2=new int[arr.length-1];
	for(int i=1;i<=arr.length-1;i++)
		{
			arr2[i-1]=arr[i];
			if (arr2[i-1]==n)
			{return true;}
		}


return checknum(arr2,n);
}

//checknumbetter 
public static void main(String args[])
{
int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
int n=61;
boolean b=checknum(arr,n);
System.out.println(b);
}
}