import java.util.*;
public class Primeno 
{

	public static void main(String[] args)
	{
		boolean isPrime=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	    int n=sc.nextInt();
		
	    int r=n/2;
	    
		int i;
		for(i=2; i<=r; i++)
		{
			if(n%i==0)
			{
				isPrime=true;
				break;
			}
		}
		    if(!isPrime)
		    {
		     System.out.println("The number is Prime no" );
		    }
		    else
		    {
			System.out.print("The number is not prime no");
	     	}
		}	
	}

/*
OUTPUT
Enter the number
5
The number is Prime no

Enter the number
6
The number is not prime no
*/

