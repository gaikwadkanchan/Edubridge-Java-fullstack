//Write programm for inserting Element in array

import java.util.*;
public class Insertelement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
         int i,n,pos,x;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int a[] = new int[n+1];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
     
 System.out.println("Enter the position of the number ehere you want to insert element");
 pos = sc.nextInt();
    
 System.out.println("Enter the element you want to be insert");
 x = sc.nextInt();
 
 for(i=(n-1);i>=(pos-1);i--)
     	{
         a[i+1]=a[i];
     }
     a[pos-1]=x;
     
 System.out.println("\n after inserting\n");
     for(i=0;i<n;i++) 
     {
         System.out.println(a[i]+"");
     }
        // System.out.println(a[n]); 
     }

	}

/*
OUTPUT
Enter the number of elements:
5
Enter the elements

11
12
13
1
15
Enter the position of the number ehere you want to insert element
4
Enter the element you want to be insert
14

 after inserting

11
12
13
14
1


*/