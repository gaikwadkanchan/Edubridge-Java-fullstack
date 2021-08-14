
public class ActiveCount1 extends Thread
{
	ActiveCount1( String threadname, ThreadGroup tg)
	{
		super(tg, threadname);
		start();
	}
	public void run()
	{
		System.out.println("running thread name is:" +Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		ThreadGroup g1=new ThreadGroup("Parent thread name");
		ActiveCount1 t1=new ActiveCount1("Java", g1);
		ActiveCount1 t2=new ActiveCount1("Junit", g1);
		System.out.println("number of active thread: "+g1.activeCount());
	}
}