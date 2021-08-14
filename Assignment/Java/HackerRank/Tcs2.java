//Tcs quetion

import java.util.*;
public class Tcs2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter the km");
	int km=sc.nextInt();
	int temp,product=1;
	
	if(km<0 || km>32767)
	{
		System.out.print("Invalid");	
	}
	else
	{
		temp=km;
		while(temp!=0)
		{
		product=product*(temp%10);
		temp=temp/10;
		}
		System.out.print(product);
	}
	}

}


/*
OUTPUT
Enter the km
34
12 

Enter the km
-12
Invalid

Enter the km
34567
Invalid
 */
