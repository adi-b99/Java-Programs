//check wheter the array is sorted using recursion 
public class checksort{
public static boolean checksorted(int arr[],int startval)
{
if(startval==(arr.length-1))
{
	//only 2 elements in the array so will be in sorted order
	return true;
}
if(arr[startval]>arr[startval+1])
{
	return false;
}



return checksorted(arr,startval+1);
}

public static void main(String Args[])
{
int[] arr= new int[]{1,2,3,4,5,69,7,8,9,13,22};
boolean b=checksorted(arr,0);
System.out.println(b);
}
}
