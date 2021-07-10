import java.util.*;
class Operation
{
public static void main(String s[])
{
double=A;
Scanner sc=new Scanner(System.in);
System.out.println("1 - Area of Traingle");
System.out.println("2 - Area of Square");
System.out.println("3 - Area of  Circle");
System.out.println("4 - Area of  Rectangle");
System.out.println("Enter your choise");
int N=sc.nextInt();

if(N==1)
{
System.out.print("enter the base and hieght of traingle");
int b=sc.nextInt();
int h=sc.nextInt();
A=(b*h)/2;
System.out.print("Area of traingle is" +A);
}
else if(N==2)
{
System.out.print("enter the side of square");
int a=sc.nextInt();
A=a*a;
System.out.print("Area of square is" +A);
}
else if(N==3)
{
System.out.print("enter the radius of circle");
float r=sc.nextFloat();
A=3.14*r*r;
System.out.print("Area of circle is" +A);
}
else
{
System.out.print("enter the length and wiedth od rectangle");
int l=sc.nextInt();
int w=sc.nextInt();
A=w*l;
System.out.print("Area of rectangle is" +A);
}
}
}
