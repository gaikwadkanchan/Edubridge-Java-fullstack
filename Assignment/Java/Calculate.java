import java.util.Scanner;
public class Calculate 
{
    public static void main(String[] args) 
    {
        int m, n, opt, add, sub, mul;
        double div, mod;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        m = s.nextInt();
        System.out.print("Enter second number:");
        n = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for modulus");
            System.out.println("Enter 6 to Exit");
            opt = s.nextInt();
            switch(opt)
            {
                case 1:
                add = m + n;
                System.out.println("Result:"+add);
                break;
 
                case 2:
                sub = m - n;
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = m * n;
                System.out.println("Result:"+mul);
                break;
 
                case 4:
                div = (double)m / n;
                System.out.println("Result:"+div);
                break;    
 
                case 5:
                mod= (double)m % n;
                System.out.println("Result:"+mod);
                break; 
   
                case 6:
                System.exit(0);
            }
        }
    }
}

/*output

D:\Programs>javac Calculate.java

D:\Programs>java Calculate
Enter first number:6
Enter second number:5
Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for modulus
Enter 6 to Exit
1
Result:11
Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for modulus
Enter 6 to Exit
2
Result:1
Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for modulus
Enter 6 to Exit
3
Result:30
Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for modulus
Enter 6 to Exit
4
Result:1.2
Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for modulus
Enter 6 to Exit
5
Result:1.0
Enter 1 for addition
Enter 2 for subtraction
Enter 3 for multiplication
Enter 4 for division
Enter 5 for modulus
Enter 6 to Exit
6

D:\Programs>*/