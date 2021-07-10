//Multidimentional Array
import java.util.Scanner;
public class ArrMul {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		 
         int[][] arr=new int[3][2];
         int i,j;
 
 System.out.println("Enter Array elements:") ;
   for(i=0;i<3;i++)
   {
	   for(j=0;j<2;j++) 
	   {
		   arr[i][j]=sc.nextInt();	
		   }
	   System.out.println("\n") ;
   }
   System.out.println(" Array elements:");
	 for(i=0;i<3;i++)
	   {
		   for(j=0;j<2;j++) 
		   {
			   System.out.println(arr[i][j]);
		   }
}
}
}

/*
output
Enter Array elements:
2
3


4
5


7
8


 Array elements:
2
3
4
5
7
8
*/