//Write program whether given no is armstrong or not

import java.util.*;
public class Armstrongno 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		
		int rem;
		double c=0.0,digit,sum=0.0;
		int num1=num;
		int temp=num1;
		while(num>0)
		{
			rem=num%10;
			{
				c++;
			}
			num=num/10;
		}
	while(num1>0)
	{
		digit=num1%10;
		sum=sum+Math.pow(digit, c);
		num1=num1/10;
	}
	if(sum==temp)
	{
		System.out.print("The number is armstrong no");
	}
	else
	{
		System.out.print("The number is not armstrong no");	
	}
		
	}

}

/*
  OUTPUT
  Enter the no
45
The number is not armstrong no

Enter the no
153
The number is armstrong no
 */
