//Write program whether given no is Perfect no or Not


import java.util.*;
public class Loopfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextLong();

		for(int i=1; i<=n/2; i++)
		{
		if(n%i==0)
		{
		sum+=i;
		}
		}
		if(sum==n)
		{
		System.out.println("is a perfect no:" +n);
		}
		else
		{
		System.out.println("is a not perfect no:" +n);
		}
	
	}
	
	/*
	 OUTPUT
	 Enter a number
6
is a perfect no: 6

Enter a number
9
is a not perfect no:9
	 */

}
