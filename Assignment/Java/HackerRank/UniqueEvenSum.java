import java.util.*;
public class UniqueEvenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i,j=0,n;
		int sum=0;
		System.out.println("Enter array size");
		 n=sc.nextInt();
		 if(n==0||n==1)
		 {
			 System.out.println(n);
		 }
		 System.out.print("Enter the element");       
		   int arr[]=new int[50];
		   for(i=0;i<n;i++)
		   {
			arr[i]=sc.nextInt();	
		   }
		 //  System.out.println("after sorting");
		   //Arrays.sort(arr);11
		   int arr1[]=new int[50];
		   for(i=0;i<n-1;i++)
		   {
			   if(arr[i]!=arr[i+1])
			   {
				   arr1[j++]=arr[i];
			   }
		   }
		 
		   System.out.println("After elemeniting");
		   for(i=0;i<j;i++)
		   {
			   System.out.println(arr1[i]);
		   }
		   
		   System.out.println("Sum of even element");
			for(i=0;i<j;i++)
			   {
				if(arr1[i]%2==0)
				{
					 sum=sum+arr1[i];
				}
				/*else
				{
					System.out.println("No even number");
				}*/
			   }
			System.out.println(sum);	   
	}
}
