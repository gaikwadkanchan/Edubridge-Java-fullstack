//Transposition of Matrix.

import java.util.Scanner;
public class Transpose_matrix {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the rows:") ;
		int row=sc.nextInt();
		
		 System.out.println("Enter the colum:") ;
			int coloum=sc.nextInt();
		int[][] arr=new int[row][coloum];
		int i,j;
		
		 System.out.println("Enter first Array elements:") ;
		   for(i=0;i<row;i++)
		   {
			   for(j=0;j<coloum;j++) 
			   {
				   arr[i][j]=sc.nextInt();	
				   }
			   System.out.println("\n") ;

		}
		   
		   System.out.println("The matrix before transposition:") ;
		   for(i=0;i<row;i++)
		   {
			   for(j=0;j<coloum;j++) 
			   {
				   System.out.println(arr[i][j]+" ") ;
				   }
			   System.out.println(" ") ;
		   }
			   System.out.println("after the Trasposition the Matrix is:") ;
			   for(i=0;i<coloum;i++)
			   {
				   for(j=0;j<row;j++) 
				   {
					   System.out.println(+arr[j][i]) ;
				   }

			}
		}
	}

/*
OUTPUT
Enter the rows:
2
Enter the colum:
2
Enter first Array elements:
9
4


6
5


The matrix before transposition:
9 
4 
 
6 
5 
 
after the Trasposition the Matrix is:
9
6
4
5
*/
