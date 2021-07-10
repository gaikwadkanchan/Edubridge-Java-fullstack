//pROGRAM FOR FINDING FACTORS 

import java.util.Scanner;
public class Factors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the no");
		 int n=sc.nextInt();

		 System.out.print("Factors of "+n+"are: ");
		 {
			 for(int i=1; i<=n; i++)
				 if(n%i==0)
					 System.out.print(i+"");
		 }
	}
	
}

/*
OUTPUT
Enter the no
6
Factors of 6are: 1236

Enter the no
2
Factors of 2are: 12
*/