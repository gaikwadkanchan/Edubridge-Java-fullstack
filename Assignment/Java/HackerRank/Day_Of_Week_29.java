import java.time.*;
import java.util.Calendar;
import java.util.Scanner;

public class Day_Of_Week_29 {
	
	public String dayofweek(int day,int month,int year)
	{
		 Calendar c=Calendar.getInstance();
		 c.set(year, month-1,day);
		 String [] days=new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		 int n;
		 n=c.get(c.DAY_OF_WEEK);
		 return(days[n-1]);
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str;
		System.out.println("Enter Date(MM-DD-YYYY): ");
			str=sc.nextLine();
			int day=Integer.parseInt(str.substring(3, 5));
			int month=Integer.parseInt(str.substring(0, 2));
			int year=Integer.parseInt(str.substring(6, 10));
			Day_Of_Week_29 obj=new  Day_Of_Week_29();
            System.out.println(obj.dayofweek(day,month,year));
	}

}
