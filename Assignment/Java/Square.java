import java.util.*;
class Square
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the side length of square");
int a=sc.nextInt();

int A=a*a;
System.out.print("the area of square is"+A);
}
}

/*output

D:\Programs>javac Square.java

D:\Programs>java Square
enter the side length of square4
the area of square is16
D:\Programs>
*/