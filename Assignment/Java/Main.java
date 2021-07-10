import java.util.Scanner;
public class Main  
 {  
   public static void main (String args[])  
    {  
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the Principle amount");
     float p=sc.nextInt();

     System.out.print("enter the rate");
     float r=sc.nextInt();

     System.out.print("enter the time");
     float t=sc.nextInt();
     
              float si  = (p*r*t)/100;   
              System.out.println("Simple Interest is: " +si);  
    }
}  

/* output

D:\Programs>javac Main.java

D:\Programs>java Main
enter the Principle amount14000
enter the rate10
enter the time2
Simple Interest is: 2800.0

D:\Programs>*/