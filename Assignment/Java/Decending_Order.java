//Decending Order element

import java.util.*;
public class Decending_Order {

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
    System.out.println("Decending order  array is");
    for(i=0;i<n;i++)
    {
   	System.out.println(a[i]); 

	}

}
}

/*
 OUTPUT 
 Enter the number of elements:
5
Enter the elements
15
14
11
18
13
Decending order  array is
18
15
14
13
11

*/
