//deleting from a linked list
//program to make a linked list and take input from the user 
package linked;
import java.util.Scanner;
public class deletell{
	
	public static node<Integer> deletel(node<Integer> head,int index)
	{
			int i=0;
			node<Integer> temp=head;
			node<Integer> temp2;
			while(i<(index-1))
			{
				
				System.out.println("i="+i);
				System.out.println("temp="+temp.data);
				temp=temp.next;
				i++;
			}
			//temp =30 ; temp.next =40; temp.next.next = 50
			//10-20-30 40-50
			//30-50
			//10-20-30-50 40
			temp2 = temp.next; //40
		//	temp.next = null; //40 == null
			temp.next = temp2.next; //50
			//temp2.next = null;
			
			//temp.next = (temp.next).next;
		//	temp=temp.next;
	//		temp=temp.next;
						//temp2.next = null;
	//		temp.next=temp.next.next;
			System.out.println("final temp="+temp.data);
			System.out.println("final temp.next="+temp.next.data);
			
		return head;
 	}
	
	
	public static node<Integer> insert(node <Integer> head,int index,int data)
	{	
		node<Integer> node2=new node(data);
		int i=0;
		node<Integer> temp=head;
		if(index==0)
		{
			node2.next=head;
			return node2;
		}
		while(i<index-1)
		{
			temp=temp.next;
			i++;
		}
		
		node2.next=temp.next;
		temp.next=node2;
		return head;
	}
	
	public static node<Integer> input()
	{
		node<Integer> head=null;
		System.out.println("enter elements of the linked list");
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		
		while (data!=-1)
		{
		node <Integer> node1 =new node(data);
		if (head==null)
		{
			head=node1;
			
		}
		else{
			node<Integer> temp=head;
			while(temp.next!=null)
			{
			temp=temp.next;
			}
			temp.next=node1;
		}
		
		data=s.nextInt();
		
	}
	return head;
	}
	
	public static void print(node <Integer> head)
	{
		node <Integer> temp=head;
		while(head!=null)
	{
		System.out.println(head.data);
		head=head.next;
	}
	}
	
	public static void main(String args[])
	{	
		node<Integer> head=input();
		//node<Integer> swag=insert(head,3,69);
		node<Integer> swag2=deletel(head,3);
		print(swag2);
		
	}
}
