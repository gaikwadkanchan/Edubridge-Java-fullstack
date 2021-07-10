import static java.lang.Float.sum;  
import java.util.Scanner;  
public class Average {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  xF, averageF, sumF = 0;   
      Scanner sc = new Scanner(System.in);     
      System.out.println("Enter the value of n");  
      n = sc.nextInt();  
      while (count <= n)   
             {   
                  System.out.println("Enter the "+count+" number?");  
                  xF = sc.nextInt();  
                  sumF += xF;   
                  ++count;   
             }   
                  averageF = sumF/n;   
        System.out.println("The Average is"+averageF);  
    }    
}  


#output
D:\Programs>javac Average.java

D:\Programs>java Average
Enter the value of n
5
Enter the 1 number?
5
Enter the 2 number?
6
Enter the 3 number?
7
Enter the 4 number?
8
Enter the 5 number?
9
The Average is7.0

