//Write program for Printing maximum and minimum value from array.

import java.util.Scanner;
public class MaxMinArry {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
         int i,n,pos;
         int arr[] = new int[5];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<5;i++)
     {
         arr[i] = sc.nextInt();
     }
     int max=arr[0];
     for(i=0;i<5;i++)
     {
    	 if(arr[i]>max)
    		 max=arr[i];
     }
     System.out.println("The max element in the array is:" +max) ;
     
     int min=arr[0];
     for(i=0;i<5;i++)
     {
    	 if(arr[i]<min)
    		 min=arr[i];
     }
     System.out.println("The max element in the array is:" +min) ;
	}

}


/*
OUTPUT
Enter the elements
9
5
8
7
2
The max element in the array is:9
The max element in the array is:2
*/