import java.util.*;
class Greater
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three no");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a>=b && a>=c)                                   //(a>=b || a>=c)
{
System.out.print("Its Greatest no is" +a);
}
else if(b>=a && b>=c)                           //(b>=a || b>=c)
{
System.out.print("Its Greatest no is" +b);
}
else
{
System.out.print("Its Greatest no is" +c);
}
}
}

/*output
D:\Programs>javac Greater.java

D:\Programs>java Greater
Enter the three no
34
32
23
Its Greatest no is34
D:\Programs>java Greater
Enter the three no
30
20
30
Its Greatest no is30
*/