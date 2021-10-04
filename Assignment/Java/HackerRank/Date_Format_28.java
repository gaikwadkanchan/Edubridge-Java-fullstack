import java.text.ParseException;
import java.util.*;
import java.text.*;

public class Date_Format_28 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Sample Input");
		String str=sc.nextLine();
		try
		{
			DateFormat df =new SimpleDateFormat("dd-mm-yyyy");
			getNoOfDaysInMonth(df,df.parse(str));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
	 public static void getNoOfDaysInMonth(DateFormat df, Date date)
	 {
		 Calendar cal=Calendar.getInstance();
		 cal.setTime(date);
		 System.out.println("The no of days in a month");
		 System.out.println(cal.getActualMaximum(Calendar.DATE));
	 }
    
}
