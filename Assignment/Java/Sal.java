import java.util.*;
class Sal
{
public static void main(String s[])
{
float salary,bonus,newsal;
Scanner sc=new Scanner(System.in);
System.out.print("enter the salary");
salary=sc.nextFloat();
if(salary>20000)
{
bonus=(float)(0.10*20000);
newsal=bonus+salary;
System.out.print("then the incremented salary is"+newsal);
}
else
{
System.out.print("The given salary is not greater than 20000");
}
}
}

/*
output

D:\Programs>java Sal
enter the salary22000
then the incremented salary is24000.0
D:\Programs>javac Sal.java

D:\Programs>java Sal
enter the salary18000
The given salary is not greater than 20000
D:\Programs>
*/
