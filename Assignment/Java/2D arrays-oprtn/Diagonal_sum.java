
//Sumof diagonal
import java.util.Scanner;
public class Diagonal_sum {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total rows and coloum:") ;
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("enter matrix");
		int sum=0,sum1=0;
		
		 for(i=0;i<n;i++)
		  {
			 for(j=0;j<n;j++)
			  {
				 arr[i][j]=sc.nextInt();
				 System.out.println("");			
				 }
		  }
	 for(i=0;i<n;i++)
	  {
		 for(j=0;j<n;j++)
		  {
			 if(i==j)
			 {
				 sum=sum+arr[i][j];
			 }
			 if(i+j==n-1)
			 {
				 sum1=sum1+arr[i][j];
			 }
		 }
	 }
	 System.out.println(Math.abs(sum-sum1));
  }
}
