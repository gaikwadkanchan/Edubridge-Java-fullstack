//Write program by arranging three no in Ascending order

import java.util.*;
public class Ascending
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the no");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 
	 if(a>b && b>c)
	 {
		 System.out.print("Order" +c+" "+b+" "+a);
	 }
	 else if(a<b && b<c)
	 {
		 System.out.print("Order" +a+" "+b+" "+c);
	 }
	 else if(a<b && b>c)
	 {
		 System.out.print("Order" +c+" "+a+" "+b);
	 }
	 else if(a>b && b<c)
	 {
		 System.out.print("Order" +b+" "+c+" "+a);
	 }
	 else if(b>c && a<c)
	 {
		 System.out.print("Order" +a+" "+c+" "+b);
	 }
	 else
	 {
		 System.out.print("Order" +b+" "+a+" "+c); 
	 }

	}

}


/*
OUTPUT
Enter the no8
4
6
Order4 8 6

Enter the no2
3
4
Order2 3 4

Enter the no6
7
4
Order4 6 7


*/