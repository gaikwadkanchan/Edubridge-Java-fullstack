import java.util.*;
class Traingle
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter the base of traingle");
int b=sc.nextInt();

System.out.print("enter the height of traingle");
int h=sc.nextInt();

int A=(b*h)/2;
System.out.print("The area of Traingle is"+A);
}
}

/*output

D:\Programs>javac Traingle.java

D:\Programs>java Traingle
enter the base of traingle3
enter the height of traingle5
The area of Traingle is7
D:\Programs>
*/
