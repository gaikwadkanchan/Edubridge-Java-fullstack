//Use default keyword in java 8
interface Print
{
	void show();
	default void msg()
	{
		System.out.println("using default interface of java 8");
	}
}
class Data1 implements Print
{
	public void show()
	{
		System.out.println("I am in data class");
	}
}
public class InterfaceEx1 
{
	public static void main(String[] args)
	{
		Data1 d=new Data1();
		d.show();
		d.msg();
	}

}

/*
OUTPUT
I am in data class
using default interface of java 8
*/