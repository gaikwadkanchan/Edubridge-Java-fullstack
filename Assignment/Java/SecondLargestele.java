//Find out second largest no from array

import java.util.Scanner;

public class SecondLargestele {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
         int i,n,pos,temp;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int a[] = new int[10];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
     for(i=0;i<n;i++) 
     {
    	 for(int j=i+1;j<n;j++)
    	 {
    		 if(a[i]<a[j])
    		 {
    			 temp=a[i];
    			 a[i]=a[j];
    			 a[j]=temp;
    		 }
    	 }
     }
     System.out.println("decending order  array is");
     for(i=0;i<n;i++)
     {
    	System.out.println(a[i]); 
     }
     System.out.println("The second largest no is"+a[1]);
	}

}

/*
OUTPUT
Enter the number of elements:
5
Enter the elements
12
15
13
18
19
decending order  array is
19
18
15
13
12
The second largest no is18
*/