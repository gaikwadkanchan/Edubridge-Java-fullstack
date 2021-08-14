//Calculate squre of number
interface Cal
{
	void info();
	static int sq(int x)
	{
		return x*x;
	}
}
class Show implements Cal
{
	public void info()
	{
		System.out.println("Calculating square of no");
	}
}
public class InterfaceEx2 
{
	public static void main(String[] args)
	{
		Cal c=new Show();
		c.info();
		System.out.println(Cal.sq(3));	
	}
}

/*
OUTPUT
Calculating square of no
9
*/