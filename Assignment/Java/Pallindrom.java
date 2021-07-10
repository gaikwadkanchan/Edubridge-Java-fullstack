import java.util.*;
class Pallindrom
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int r,sum=0,temp;
System.out.println("Enter the no");
int n=sc.nextInt();

temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}

if(temp==sum)
{
System.out.println("The no is pallindrom");
}
else
{
System.out.println("The no is not pallindrom");
}
}
}