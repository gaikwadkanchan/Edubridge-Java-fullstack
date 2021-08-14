/*
 Ram and Mohan are two brothers. They are not good in maths.So thier father decided to give some assignment as a game so that they can lean the concept
 of number system, So he gave two number to them. One is the sum of two number, x & y.
 Note:
 The two number should be printed in ascending order.
 
 Input format:
 The input contains two integer in the same line separated by space,that denonets the sum of x & y and the product of x & y,respectively.
 
  Output format:
  The output consist of two no separated by space which correspond to x and y in ascending order.
 */

import java.util.*;
public class Two_number {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int i,j,x,y;
 System.out.println("Enter the no x & y");
 x=sc.nextInt();
 y=sc.nextInt();
 System.out.println(x+" "+y);
 
 for(i=1;i<=100;i++)
 {
	 for(j=i;j<=100;j++)
	 {
		 if((i+j==x) && (i*j==y))
		 {
			 System.out.println(i+" "+j);
			 break;
		 }
	 }
 }
}
}

/*
output
Enter the no x & y
15
50
15 50
5 10
*/