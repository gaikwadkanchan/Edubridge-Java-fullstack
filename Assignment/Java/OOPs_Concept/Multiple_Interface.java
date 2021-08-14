//Program for Multiple interface
interface employe
{
	void work();
}
interface dept
{
	void manager();
}
interface client
{
	void call();
}
class office implements employe,dept,client
{
	public void work()
	{
		System.out.println("Now aday employee are doing a work from home");
	}
	public void manager()
	{
		System.out.println("manager is observing thier work virtually");
	}
	public void call()
	{
		System.out.println("Number of clientdefine the growthof organisation");
	}
}
public class Multiple_Interface {

	public static void main(String[] args) {
		office f=new office();
		f.work();
		f.manager();
		f.call();
	}

}

/*
OUTPUT
Now aday employee are doing a work from home
manager is observing thier work virtually
Number of clientdefine the growthof organisation
*/