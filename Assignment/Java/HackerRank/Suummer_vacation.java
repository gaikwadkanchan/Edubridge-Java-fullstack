/*
 In summer vacation time,the  student of ABC school went for team outing. One day the instrucor decided to find one funny game
 so that student can enjoy.So he told them to take one integer N and arrange in the digits of the integers in incremental order from right to left.
 Helf Student by writing a code.
 Input format:
 The first line contains a single integer that denotes the given number,n
 Output format:
 the output is an integer in Which the digit of N are arranged in incremental order from right to left.
 INPUT
251
OUTPUT
521 
  */
//package com.SummerVacation;
import java.util.*;
public class Suummer_vacation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        int i,num,n,reverse=0;

System.out.println("Enter the number:") ;
num = sc.nextInt();
for (i=9;i>=0;i--)
{
	int temp=num;
while(temp>0)
{
	 n=temp%10;
	if(n==i)
	{
	reverse*=10;
	reverse+=n;
	}
	temp/=10;
}
}
System.out.println("The reverse of given number is:" +reverse) ;
}
}

/*
OUTPUT
Enter the number:
572
The reverse of given number is:752
*/