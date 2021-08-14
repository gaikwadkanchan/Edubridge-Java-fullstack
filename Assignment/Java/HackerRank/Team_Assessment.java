import java.util.*;
public class Team_Assessment 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
     	int i,j,n,temp;
		int count=0;
		
		System.out.println("Enter the Size of array");
		n=sc.nextInt();
	
		int arr[]=new int[50];
		int arr1[]=new int[50];
		System.out.println("Enter The Element In Array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
            for (j = 0; j < i; j++)

               if (arr[i] == arr[j])
                    break;

            if (i == j)
            {
                count++;
               arr1[i]=arr[i];
                
            }
        }
		System.out.println(count);
		 for(i=0;i<n;i++) 
		    {
		   	 for(j=i+1;j<n;j++)
		   	 {
		   		 if(arr1[i]>arr1[j])
		   		 {
		   			 temp=arr1[i];
		   			 arr1[i]=arr1[j];
		   			 arr1[j]=temp;
		   		 }
		   	 }
		    }
		    for(i=0;i<n;i++)
        System.out.print( arr1[i] + " ");
	}
}
