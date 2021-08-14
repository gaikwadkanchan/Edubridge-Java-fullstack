
public class Destroy1 extends Thread
{
	 Destroy1( String threadname, ThreadGroup tg)
	{
		super(tg, threadname);
		start();
	}
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("Exception encountered");
			}
		}
		System.out.println(Thread.currentThread().getName()+ "Finished executing");
	}
	public static void main(String[] args)throws Exception
	{
		ThreadGroup g1=new ThreadGroup("Parent thread");
		ThreadGroup g2=new ThreadGroup(g1,"Child thread");
		
		ActiveCount1 t1=new ActiveCount1("Java", g1);
		ActiveCount1 t2=new ActiveCount1("Junit", g1);
		
		t1.join();
		t2.join();
		
		g2.destroy();
		System.out.println(g2.getName() + "destroyed");
		g1.destroy();
		System.out.println(g1.getName() + "destroyed");
	}
}