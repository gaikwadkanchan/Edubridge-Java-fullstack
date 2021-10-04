import java.util.Scanner;

public class Largest_diff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		
		System.out.println("Enetr the size of array");
		int n=sc.nextInt();
		System.out.println("Enetr the array element");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
	     for(int i=0;i<5;i++)
	     {
	    	 if(arr[i]>max)
	    		 max=arr[i];
	     }
	     System.out.println("The max element in the array is:" +max) ;
	     
	     int min=arr[0];
	     for(int i=0;i<5;i++)
	     {
	    	 if(arr[i]<min)
	    		 min=arr[i];
	     }
	     System.out.println("The max element in the array is:" +min) ;
		
		int diff=max-min;
		System.out.println("Difference of max and min element is  : "+ diff);
	}

}
