import java.util.*;
class Ternary
{
public static void main(String s[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=a>b ? a:b;
System.out.print("Greater no is"+c);
}
}

/*
output

D:\Programs>javac Ternary.java

D:\Programs>java Ternary
Enter the number3
4
Greater no is4
D:\Programs>
*/