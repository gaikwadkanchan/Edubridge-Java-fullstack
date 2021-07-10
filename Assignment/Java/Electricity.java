/*Write the program to input electricity unit  chrges & calculate total electricity bill according to the  given condition
1.for first 50 units rs. 0.50/unit
2.for next 100 units rs. 0.75/unit
3.for next 100 units rs. 1.20/unit
4.for unit above 250 rs.1.50/unit*/

import java.util.*;
class Electricity
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the unit of Electricity");
double unit=sc.nextDouble();

if(unit<=50)
{
double cal=unit*0.50;
System.out.print("The total bill is" +cal);
}
else if(unit<=150)
{
double cal=25+(unit-50)*0.75;
System.out.print("The total bill is" +cal);
}
else if(unit<=250)
{
double cal=100+(unit-150)*1.20;
System.out.print("The total bill is" +cal);
}
else
{
double cal=220+(unit-250)*1.50;
System.out.print("The total bill is" +cal);
}
}
}
/*
output
D:\Programs>java Electricity
Enter the unit of Electricity
200
The total bill is240.0
D:\Programs>java Electricity
Enter the unit of Electricity
80
The total bill is60.0
D:\Programs>java Electricity
Enter the unit of Electricity
100
The total bill is75.0
*/