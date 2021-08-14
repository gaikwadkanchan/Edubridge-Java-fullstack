/*
 Read the quetion carefully and follow the Output format.
 Given an input array first index indicates the cricketer id and second index indicates the score and to on
 Find out cricketer id who scored more than given score
 
 INPUT AND OUTPUT FORMAT
 first line of input consist of n, the number of elements. Next n line correspond to the array element.The next line of the input consist of an integer
 that correspond to the given score.output consist of an integer array. Which contains cricketers id who have scored more than given score.
 
  1) Print "Invalid size" when size of array is negative and terminate the program
  2)Print "Invalid size" when there is any negative numbers available in the input array and terminate the program.
  3)Print "Invalid score" when the score is negative.
  
  Include a function named CricketrId(int array[],int size,int score)whose returns type is void.
  Thwe ouput array is stored variable named cricketer.
 */

import java.util.*;
public class CricketerId
{
	public static void main(String[] args) 
	{
		int n,i,score,j=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of element: ");
		n=sc.nextInt();
		
           if(n<0)
			{
				 System.out.println("Invalid array Size") ; 
				 System.exit(0);
			}
			else
			{
			 System.out.print("Enter the element");       
			   int arr[]=new int[n];
			   for(i=0;i<n;i++)
			   {
				arr[i]=sc.nextInt();	
			   if(arr[i]<0)
			   {
				   System.out.println("Invalid Input") ; 
				   System.exit(0);
			   }
			}
	    System.out.println("Enter Score") ; 
       score=sc.nextInt();
       if(score<0)
       {
    	   System.out.println("Invalid Score");
    	   System.exit(0);
       }
       int cricketer[]=new int[50];
           for(i=1;i<n;i=i+2)
           {
        	   if(arr[i]>score)
        	   {
        		   cricketer[j]=arr[i-1];
        		   j++;
        	   }
           }
           for(i=0;i<j;i++)
           {
        	 System.out.print("Highest Score id are:") ;
          	 System.out.println(cricketer[i]);
           }
	}
}
}

/*
output
Enter the no of element: 6
Enter the element101
1000
102
2000
103
4000
Enter Score
1000
Highest Score id are:102
Highest Score id are:103

Enter the no of element: -6
Invalid array Size

Enter the no of element: 4
Enter the element101
-2000
Invalid Input

Enter the no of element: 4
Enter the element101
2000
103
4000
Enter Score
-2000
Invalid Score

*/