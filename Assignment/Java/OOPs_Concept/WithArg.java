//with argument

import java.util.Scanner;
public class WithArg {

	void sum(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		WithArg m=new WithArg();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 m.sum(a,b);
	}

}


/*
int sum(int x,int y)
	{
		int z=x+y;
		return z;
	}
	public static void main(String[] args) {
		WithArg m=new WithArg();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int result=m.sum(a,b);
		 System.out.println("the sum is: "+result)
	}

}

*/