//Substraction of two Matrix

import java.util.Scanner;
public class Sub_Matrix {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		 int[][] arr1=new int[2][2];
		 int[][] sub=new int[2][2];
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
		   
		   System.out.println("subtraction of two matrix is") ;
		   for(i=0;i<2;i++)
		   {
			   for(j=0;j<2;j++) 
			   {
				   sub[i][j]=arr[i][j]-arr1[i][j];	
				   System.out.println(sub[i][j]+"\n");
				   }
			  
		   }

	}

}


/*
OUTPUT

Enter first Array elements:
9
8


7
6


Enter second Array elements:
5
4


3
2


subtraction of two matrix is
4

4

4

4
*/