import java.util.*;
class Leap
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the year");
int y=sc.nextInt();
if(y%4==0)
{
System.out.print("the given year is leap year");
}
else
{
System.out.print("The given year is not leap year");
}
}
}

/*
output

D:\Programs>java Leap
enter the year2000
the given year is leap year
D:\Programs>javac Leap.java

D:\Programs>java Leap
enter the year2021
The given year is not leap year
D:\Programs>javac Leap.java

D:\Programs>java Leap
enter the year2014
The given year is not leap year
D:\Programs>
*/