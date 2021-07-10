/*Write program to input marks of five  subject physics,chemistry,biology,Mathematics & computer.
 Calculate Percentage and grade according to following
Percentage>=90% ; GradeA 
Percentage>=80% ; GradeB 
Percentage>=70% ; GradeC 
Percentage>=60% ; GradeD
Percentage>=40% ; GradeE
Percentage<40% ; GradeF 
*/

import java.util.*;
class Grade
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter  the marks of physics, chem,bio,math and comp");
int p =sc.nextInt();
int c =sc.nextInt();
int b=sc.nextInt();
int m=sc.nextInt();
int comp=sc.nextInt();

float per=(p+c+b+m+comp)/5;
System.out.println("The percentage is" +per);

if(per>=90)
{
System.out.print("Grade A");
}
else if(per>=80)
{
System.out.print("Grade B");
}
else if(per>=70)
{
System.out.print("Grade C");
}
else if(per>=60)
{
System.out.print("Grade D");
}
else if(per>=40)
{
System.out.print("Grade E");
}
else
{
System.out.print("Grade F");
}
}
}
/*
output
D:\Programs>javac Grade.java
D:\Programs>java Grade
Enter  the marks of physics, chem,bio,math and comp
78
89
99
67
56
The percentage is77.0
Grade C

D:\Programs>javac Grade.java
D:\Programs>java Grade
Enter  the marks of physics, chem,bio,math and comp
90
90
90
90
90
The percentage is90.0
Grade A
D:\Programs> */