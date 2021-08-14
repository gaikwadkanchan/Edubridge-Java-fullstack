
public class Runn1 {

	public static void main(String[] args) {
		Runnable r=new Runnable()
				{
			public void run()
			{
			for(int i=1;i<=5;i++)
			{
			System.out.println("java");	
			try {
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.print(e);
				}
			}
		}
	};
		Runnable r1=new Runnable()
				{
			public void run()
			{
			for(int i=1;i<=5;i++)
			{
			System.out.println("junit");
			try {
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.print(e);
				}
	    	}
		}
	};
		Thread t=new Thread(r);
		t.start();
		Thread t1=new Thread(r1);
		t1.start();
	}
}

