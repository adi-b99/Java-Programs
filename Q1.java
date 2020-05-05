import java.util.*;

class Student{
	String name;
	String regno; 
	float marks;
	static float classAverage;
	static{
		classAverage = 0;
	}
	void input()
	{	
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = inp.next();
		System.out.println("Enter Regno: ");
		regno = inp.next();
		System.out.println("Enter Marks: ");
		marks = inp.nextInt();
	}
	void output()
	{
		System.out.println("Name\t"+name);
		System.out.println("Regno\t"+regno);
		System.out.println("Marks\t"+marks);
	}
	static void getClassAverage(Student[] m,int n)
	{
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum += m[i].marks;
		}
		classAverage = sum/n;
		System.out.println("The class average is\t"+classAverage);
	}
}

class Q1{
	public static void main(String[] arg)
	{
		Student[] S = new Student[100];
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = inp.nextInt();
		System.out.println("Enter the details of students: ");
		for(int i=0;i<n;i++)
		{
			S[i] = new Student();
			S[i].input();
		}
		System.out.println("The details of students are: ");
		for(int i=0;i<n;i++)
		{
			S[i].output();
		}
		Student.getClassAverage(S,n);
	}
}