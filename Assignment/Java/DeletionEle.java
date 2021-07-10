//Deletion of an element in array

import java.util.*;
public class DeletionEle {

		 public static void main(String args[])
		 {
		 Scanner sc = new Scanner(System.in);
		 
		         int i,n,pos;
		 
		 System.out.println("Enter the number of elements:") ;
		 n = sc.nextInt();
		 int a[] = new int[n];
		 
		     System.out.println("Enter the elements") ;
		     for(i=0;i<n;i++)
		     {
		         a[i] = sc.nextInt();
		     }
		 
		     
		 System.out.println("Enter the position of the number which is to be deleted");
		 pos = sc.nextInt();
		    
		 for(i=pos;i<n-1;i++)
		     	{
		         a[i]=a[i+1];
		     }
		     n=n-1;
		     
		 System.out.println("\nOn deleting new array we get is\n");
		     for(i=0;i<n;i++) 
		     {
		         System.out.println("a["+i+"] = "+a[i]);
		         //System.out.println(+a[i]); 
		     }
		 }
		}

/*
output

Enter the number of elements:
4
Enter the elements
5
4
6
9
Enter the position of the number which is to be deleted
4

On deleting new array we get is

a[0] = 5
a[1] = 4
a[2] = 6
 */