import java.util.*;
class Pass
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the mark");
int m=sc.nextInt();
if(m>=40)
{
System.out.print("pass");
}
else
{
System.out.print("Fail");
}
}
}

/*
output
D:\Programs>javac Pass.java

D:\Programs>java Pass
enter the mark45
pass
D:\Programs>javac Pass.java

D:\Programs>java Pass
enter the mark35
Fail
D:\Programs>
*/