import java.util.*;
class Vote
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the edge of person");
int e=sc.nextInt();
if(e>=18)
{
System.out.print("the person are eligible for vote");
}
else
{
System.out.print("The person are not eligible for vote");
}
}
}

/*
output
D:\Programs>javac Vote.java

D:\Programs>java Vote
enter the edge of person25
the person are eligible for vote
D:\Programs>javac Vote.java

D:\Programs>java Vote
enter the edge of person16
The person are not eligible for vote
D:\Programs>
*/