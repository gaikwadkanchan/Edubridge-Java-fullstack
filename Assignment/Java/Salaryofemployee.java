/*
 Repeated salary count
 John is Working as clerk in an organisation Where N no of people are working.
 His boss has asked him to get the count of employee who get same salary.
 Help him to get the count of repeated salary.
 The first argument is the input array and the second argument is an int that corresponds to the size of array.The functions returns and int
 that corresponds to the number of repeaters.
 If the size of array is negative or if any of the array element are negative,print"Invalid input" and terminate the program.
 Input and output format: 
 input consist of n+1 integers. the first integer correspond to small n, Tthe no of element in the array.
 The next 'n' integer correspond to the element in the array.
 output consist of an integer that corresponds to the no of repeater
 Assume that atmost 1 element in the array would repeat
 Assume that the maximum no of element in array is 20
  
 
 */

import java.util.Scanner;

public class Salaryofemployee {

	public static void main(String[] args) {
		
		int n;
		int i,j,count=0;
		
		int arr[]=new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NO OF Employee:") ;
		n=sc.nextInt();
		
			
		if(n<0)
		{
			 System.out.println("Invalid Input") ; 
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
			  for(i=0;i<n;i++)
			  {
				  for(j=i+1;j<n;j++)
				  {
					  if(arr[i]==arr[j])
					  {
						 count++;
					  }
				  }
			  }
		   System.out.println("the repeated salary is"+count);
	}

	}
}

/*
OUTPUT
Enter NO OF Employee:
5
1000
2000
3000
2000
2000
the repeated salary is3

Enter NO OF Employee:
-5
Invalid Input

Enter NO OF Employee:
3
1000
-2000
Invalid Input

*/