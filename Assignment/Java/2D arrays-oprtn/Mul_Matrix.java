//Multiplication of Two Matrix

import java.util.Scanner;
public class Mul_Matrix {

	public static void main(String[] args) {
		 int[][] arr=new int[2][2];
		 int[][] arr1=new int[2][2];
		 int[][] mul=new int[2][2];
	        int i,j;	
	       
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first Array elements:") ;
	   for(i=0;i<2;i++)
	   {
		   for(j=0;j<2;j++) 
		   {
			   arr[i][j]=sc.nextInt();	
			   }
		   System.out.println("\n") ;

	}
	   System.out.println("Enter second Array elements:") ;
	   for(i=0;i<2;i++)
	   {
		   for(j=0;j<2;j++) 
		   {
			   arr1[i][j]=sc.nextInt();	
			   }
		   System.out.println("\n") ;
	   }
		   
		   System.out.println("Multiplication of two matrix is") ;
		   for(i=0;i<2;i++)
		   {
			   for(j=0;j<2;j++) 
			   {
				   mul[i][j]=0;
				   for(int k=0;k<2;k++) 
				   { 
				   mul[i][j]=mul[i][j]+(arr[i][k]*arr1[k][j]);	
				   }
				   System.out.println(mul[i][j]+"\n");
			   }
		   }

	}

}

/*
OUTPUT
Enter first Array elements:
1
2


3
4


Enter second Array elements:
3
2


1
2


Multiplication of two matrix is
5

6

13

14
*/