import java.util.*;
public class WitoutArg {

	int sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 
		 int z=x+y;
		 return z;
	}
	public static void main(String[] args) {
		WitoutArg m=new WitoutArg();
		int res=m.sum();
		System.out.println(+res);

	}

}
