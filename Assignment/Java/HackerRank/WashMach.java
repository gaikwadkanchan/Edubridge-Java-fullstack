import java.util.*;
public class WashMach {

public int myfun(int n)
{
	if(n>0 && n<2000)
	{
		System.out.println("time estimate : 25 minute");
	}
	else if(n>2001 && n<4000)
	{
		System.out.println("time estimate : 35 minute");
	}
	else if(n==7000)
	{
		System.out.println("Maximum Capicity");
	}
	if(n==0)
	{
		System.out.println("time estimate : 0");
	}
	else
	{
		System.out.println("Invalid Input");
	}
	return n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
         WashMach w=new WashMach();
         w.myfun(n);
	}

}
