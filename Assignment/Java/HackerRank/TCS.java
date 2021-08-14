/*
 1.Calculate salary
 Read the question carefully and follow the input and output format
 Karen Got salary for this month and the spend 20% of her salary for food and 30% of her salary for travel.
 If she takes care of other shifts she will gets 2% of the salary per day. Given her salary and the number of shifts she handled.
 Calculate how much she can save in her pocket after spending all these?
 
 Input and Output format:
 First line of input consists of an integer, salary. Next line correspond to the number of shifts.
 output consist of an integer,which is saving.
 
 1.Print "salary too large" when salary>8000
 2.Print "shifts too small" when shift<0
 3.Print "salary too salary" when salary<0
  
  Include function nme calculateSal(int salary,int shifts) whose return type is integer which is saving
 
 */

import java.util.*;
public class TCS {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
  
 int salary,shift;
 double saves=0;
 System.out.println("Enter the salary");
 salary=sc.nextInt();
 
 System.out.println("Enter the shift");
 shift=sc.nextInt();
 
 if(salary>8000)
 {
	 System.out.println("The salary is greater than 8000");
 }
 else if(salary<=0)
 {
	 System.out.println("The salary is too samll");
 }
 else if(shift<=0)
 {
	 System.out.print("Shift is too small");
 }
 else
 {
	saves=(salary*0.2)+(salary*0.3)+(salary*0.020*shift);
	System.out.print("the saving is"+saves);
 }
 
	}

}


/*
 output
 Enter the salary
7000
Enter the shift
0
the saving is3500.0

Enter the salary
8800
Enter the shift
2
The salary is greater than 8000

Enter the salary
0
Enter the shift
0
The salary is too samll
*/


