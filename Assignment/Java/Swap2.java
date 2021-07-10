import java.util.*;
class Swap2{  
 public static void main(String s[]) 
{  
 Scanner sc= new Scanner(System.in);
 System.out.println("Before swapping"); 
 System.out.println("Enter the value of X and Y");  
       int x = sc.nextInt();  
       int y = sc.nextInt(); 
  
 System.out.println("After swapping");  
 x = x + y;  
 y = x - y;  
 x = x - y;  
  System.out.println("value of x:" + x);  
  System.out.println("value of y:" + y);  
 }  
} 
  
/*
OUTPUT
D:\Programs>javac Swap2.java

D:\Programs>java Swap2
Before swapping
Enter the value of X and Y
45
67
After swapping
value of x:67
value of y:45

D:\Programs>
*/