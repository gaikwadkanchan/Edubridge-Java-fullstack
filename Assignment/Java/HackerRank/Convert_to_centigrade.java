/*
 Write the program to convert the given temperature from Fahrenheit to Centigrade.
 
FORMULA:
c/5=(F-32)/9;
C stands for centigrade
F stands for Fahernheit

Include a function named convertToCentigrade that accepts an Integer agument and return a float that corresponding to the centigrade equivalent.
If the inputbis anegative number.Print invalid and terminate the Program.

Input And Output Format
Input Consist of a single integer.
Output consist of a floating point number that corresponds to the centigrade equivalent. The output is displayed correct to 2 decimal places.  
 */

import java.util.Scanner;
public class Convert_to_centigrade {

	void convertToCentigrade()
	{
		float C,F;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in fahred");
		F=sc.nextFloat();
		
			if(F<0)
			{
				System.out.println("Invlid Input");
			}
			else
			{
				C=((F-32)*5)/9;
				System.out.printf("%.2f",C);
			}
	}

	public static void main(String[] args) {
		Convert_to_centigrade c=new Convert_to_centigrade();	
     	c.convertToCentigrade();
	}

}


/*
OUTPUT
Enter the temperature in fahred
77
25.00

Enter the temperature in fahred
-50
Invlid Input

*/