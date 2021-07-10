import java.util.*;
class Perfect
{
public static void main(String s[])
{
long n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextLong();

for(int i=1; i<=n/2; i++)
{
if(n%i==0)
{
sum+=i;
}
}
if(sum==n)
{
System.out.println("is a perfect no"+n);7h1  iw 
}
else
{
System.out.println("is a not perfect no"+n);
}
}
}