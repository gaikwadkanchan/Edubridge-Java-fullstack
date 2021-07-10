import java.util.*;
class Reverse {
  public static void main(String[] args)
 {

       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number");  
       int num = sc.nextInt(); 

  int reversed = 0;

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}

/*
output

D:\Programs>javac Reverse.java

D:\Programs>java Reverse
Enter the number
1234
Reversed Number: 4321

D:\Programs>
*/