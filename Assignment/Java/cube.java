import java.util.*;
class Cube
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the side of cube");
int a=sc.nextInt();

int A=a*a*a;
System.out.print("The area of Traingle="+A);
}
}

/*output
D:\Programs>javac Cube.java

D:\Programs>java Cube
enter the side of cube4
The area of Traingle=64*/