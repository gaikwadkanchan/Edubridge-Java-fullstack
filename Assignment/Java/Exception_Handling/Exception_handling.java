import java.util.*;

class MyException extends Exception
	{
	MyException(String data)
	{
		super(data);
	}
}

public class Exception_handling {    //in program class name is "Source"
	
public String checkName(String firstName,String lastName)
			{
	try
	{
	  if(firstName==null && lastName==null)
	  {
		throw new MyException("it is user defind exception");
      }
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return firstName+lastName;
}

	public static void main(String[] args)
	throws Exception
	{
		Exception_handling eh=new Exception_handling();
	try {
		eh.checkName("Alan","Hasley");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}