//Delete element in the array

import java.util.*;
public class DeletionArray {

	public static void main(String[] args) {
		
		int n,x,flag=1,loc=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of element you want in array");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.print("enter all the element");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.print("Array before the deletion");
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+",");
			}
			System.out.println();
			System.out.print("enter the element you want to delete");
			x=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				if(a[i]==x)
				{
					flag=1;
					loc=i;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==1)
			{
				for(int i=loc+1;i<n;i++)
				{
					a[i-1]=a[i];
				}
				System.out.print("After Deleting");
				for(int i=0;i<n-1;i++)
				{
					System.out.print(a[i]+",");
				}
			}
			else
			{
				System.out.print("element not found");
			}
			}
	}

/*
output
enter no of element you want in array5
enter all the element5
6
8
4
9
Array before the deletion5,6,8,4,9,
enter the element you want to delete8
After Deleting5,6,4,9,
*/