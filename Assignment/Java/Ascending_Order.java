//Ascending Order element

import java.util.*;
public class Ascending_Order {

	public static void main(String[] args)
	{
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
   		 if(a[i]>a[j])
   		 {
   			 temp=a[i];
   			 a[i]=a[j];
   			 a[j]=temp;
   		 }
   	 }
    }
    System.out.println("Ascending order  array is");
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
18
12
10
16
Ascending order  array is
10
12
15
16
18
*/