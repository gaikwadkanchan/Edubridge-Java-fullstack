//Addition of two Matrix

import java.util.Scanner;
public class Add_Matrix {

	public static void main(String[] args) {
		 int[][] arr=new int[2][2];
		 int[][] arr1=new int[2][2];
		 int[][] sum=new int[2][2];
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
		   
		   System.out.println("Addition of two matrix is") ;
		   for(i=0;i<2;i++)
		   {
			   for(j=0;j<2;j++) 
			   {
				   sum[i][j]=arr[i][j]+arr1[i][j];	
				   System.out.println(sum[i][j]+"\n");
				   }
			  
		   }
}
}

/*
output

Enter first Array elements:
1
2


3
4


Enter second Array elements:
9
8


7
6


Addition of two matrix is
10

10

10

10
*/