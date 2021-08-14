class PK
{
	int count;
	public synchronized void counter()
	{
	count++;
	}
}
public class Synchr2 {
	
	public static void main(String[] args)throws Exception {
				PK a=new PK();
			Thread t=new Thread(new Runnable()
					{
				public void run()
				{
					for(int i=1;i<=1000;i++)
					{
						a.counter();
					}
				}
			});
			
			Thread t1=new Thread(new Runnable()
			{
		public void run()
		{
			for(int i=1;i<=1000;i++)
			{
				a.counter();
			}
		}
	});
			
			t.start();
			t1.start();
			t.join();
			t1.join();
				System.out.print("Value of count "+a.count);
		}

	}
	