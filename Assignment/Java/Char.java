import java.util.*;
class Alphabet
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Give the input");
//string i=sc.nextString();
int i=sc.nextInt();

if(i==0-9)
{
System.out.print("Its number");
}
/*else if(i==A-Z || a-z)
{
System.out.print("Its character");
}*/
else
{
System.out.print("Special symbol");
}
}
}