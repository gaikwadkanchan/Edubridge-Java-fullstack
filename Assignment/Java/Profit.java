import java.util.*;
class Profit
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the cost price");
int cp=sc.nextInt();

System.out.println("Enter the selling price");
int sp=sc.nextInt();

if(cp<sp)
{
System.out.print("profit" );
}
else if(cp>sp)
{
System.out.print("Loss");
}
else
{
System.out.print("No profit no loss");
}
}
}

/*
output
D:\Programs>java Profit
Enter the cost price
200
Enter the selling price
230
profit

D:\Programs>java Profit
Enter the cost price
200
Enter the selling price
150
Loss

D:\Programs>java Profit
Enter the cost price
200
Enter the selling price
200
No profit no loss
D:\Programs>