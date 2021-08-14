/*interface employe
{
	void work();
}
interface dept
{
	void manager();
}
class Office implements employe,dept
{
	public void work()
	{
		System.out.println("Employee");
	}
	public void manager()
	{
		System.out.println("Manager");
	}
}
public class Multi1 {

	public static void main(String[] args) {
		Office f=new Office();
		f.work();
		f.manager();
	}

}*/

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Multi1 {

    public static void main(String args[])
    {
        String months[] = {

            "Jan",
            "Feb",
            "Mar",
            "Apr",

            "May",
            "Jun",
            "Jul",
            "Aug",

            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar = Calendar.getInstance();
       

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

    }
}
