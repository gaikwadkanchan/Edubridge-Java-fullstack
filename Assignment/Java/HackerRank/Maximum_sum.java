/*
 Program: Given an Integer array, find out sum of Even and odd Number individually and find the Maximum.
 Input and Output Format:
 First line of input consist of n,the number of element. Next n lines corespond to the array element.
 outputs  consist of Maximum of odd and even sum
 
 1.Print "Invalid array size" when size of an array is N/egative number and terminate the program.
 2.Print "Invalid Input" when there is any negative numbers numbers available in the input and terminate the program
 */

import java.util.Scanner;
public class Maximum_sum {

	public static void main(String[] args) {
		
		int n,i;
		int sum=0;
		int arr[]=new int[10];
		int evensum=0,oddsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:") ;
		n=sc.nextInt();
		
		if(n<0)
		{
			 System.out.println("Invalid array size") ; 
			 System.exit(0);
		}
		else
		{
		   for(i=0;i<n;i++)
		   {
			arr[i]=sc.nextInt();	
		   if(arr[i]<0)
		   {
			   System.out.println("Invalid Input") ; 
			   System.exit(0);
		   }
		}

		   for(int j=0;j<n;j++)
		   {
			  if(arr[j]%2==0)
		      {
				  evensum=evensum+arr[j];
		      }
			  else
			  {
				  oddsum=oddsum+arr[j];
			  }
		   }
	   }
		System.out.println("The sum of even is: "+evensum); 
		System.out.println("The sum of odd is: "+oddsum); 
		if(evensum>oddsum)
		{
			System.out.println("The sum even element is maximum : "+evensum);
		}
		else
		{
			System.out.println("The sum odd element is maximum: "+oddsum); 
		}
	}
}

/*
OUTPUT

Enter size of array:
-5
Invalid array size

Enter size of array:
5
12
-13
Invalid Input

Enter size of array:
5
10
11
12
13
14
The sum of even is: 36
The sum of odd is: 24
The sum even element is maximum : 36

*/