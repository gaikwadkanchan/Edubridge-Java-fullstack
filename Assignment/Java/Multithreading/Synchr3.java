class G
{
	int count;
public synchronized void counter()
{
	count++;
}
}
public class Synchr3 {

	public static void main(String[] args)throws Exception {
		G g=new G();
	Thread t=new Thread(new Runnable()
			{
		public void run()
		{
			for(int i=1;i<=1000;i++)
			{
				g.counter();
			}
		}
	});
	
	Thread t1=new Thread(new Runnable()
	{
public void run()
{
	for(int i=1;i<=1000;i++)
	{
		g.counter();
	}
}
});
	
	t.start();
	t1.start();
	t.join();
	t1.join();
		System.out.print("Value of count "+g.count);
}

}
