import java.util.*;
class Alphabet
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Give the input");
//char i=sc.nextChar();
//int i=sc.nextInt();

if(i>=0 || i<=9)
{
System.out.print("Its number");
}
else if(i>= 'a' && i<='z' || i>='A' && i<='Z')
{
System.out.print("Its character");
}
else
{
System.out.print("Special symbol");
}
}
}