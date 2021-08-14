/*
public class Source {
	public static String retString()
	{
		return "Parent";
	}
}	
class SourceSubClass extends Source
{
	public static String retString()
	{
		return "child";
	}
	
public static void main(String[] args)throws Exception
{
	SourceSubClass s=new SourceSubClass();	
	s.retString();
}
}
*/

public class Source {
	
	public static String retString()
	{
		return "Parent";
	}
	public static void main(String[] args)throws Exception
	{
		SourceSubClass s=new SourceSubClass();	
		s.retString();
	}	
}

class SourceSubClass extends Source
{
	public static String retString()
	{
		return "Child";
	} 
}