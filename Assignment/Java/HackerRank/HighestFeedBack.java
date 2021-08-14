import java.util.*;
public class HighestFeedBack
{
	public static void main(String[] args) 
	{
		int n,i,j,k=0,count,count1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		if(n<0)
		{
			System.out.println("Invalid array size");
		    System.exit(0);
		}
		else
		{
			int arr[]=new int[n];
			System.out.println("enter first array element");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}		
		}
		int arr1[]=new int[n];
		System.out.println("enter Second array element");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr1[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}		
		}
		int Score[]=new int[100];
		for(i=0;i<n;i=i+2)
		{
			count=0;
			for(j=0;j<n;j=j+2)
			{
			if(arr[i]==arr1[j])
			{
			count=1;
			if(arr[i+1]>arr1[j+1])
			{
				Score[k]=arr[i];
				Score[++k]=arr[i+1];
				k++;
			}
			else
			{
				Score[k]=arr[i];
				Score[++k]=arr1[i+1];
				k++;						
			}
		  }
		}
			if(count==0)
			{
				Score[k]=arr[i];
				Score[++k]=arr[i+1];
				k++;
			}
	      }
		for(i=0;i<n;i=i+2)
		{
			count1=0;
			for(j=0;j<n;j=j+2)
			{
				if(arr1[j]==arr[i])
				{
					count1=1;
				}
			 }
			if(count1!=0)         
			{
				Score[k]=arr1[i];
				Score[++k]=arr1[i+1];
				k++;			
			}
		  }
		for(i=0;i<k;i++)
		{
			System.out.println(Score[i]);
		}
      }
   }
}
