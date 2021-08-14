
public class Yield1 {

	public static void main(String[] args)throws Exception {
		
		Thread t=new Thread(()->
		{
		for(int i=1;i<=5;i++)
		{
		System.out.println("kanchan"+Thread.currentThread().getName());	
		try {
			Thread.sleep(500);
		}catch(Exception e)
		{
			System.out.print(e);
			}
		}
		});

		Thread t1=new Thread(()->   //lambda function
		{
		for(int i=1;i<=5;i++)
		{
		System.out.println("gaikwad");
		try {
		Thread.sleep(500);
		}catch(Exception e)
		{
		System.out.print(e);
		}
		}
		});
		
		t.start();
		try {
			for(int i=0;i<5;i++)
			{
			t1.yield();
			System.out.println();
		}
		}
		catch(Exception e)
		{
		}
		t1.start();

		t.join();
		t1.join();
		//System.out.println(t.isAlive());  //check for any thread is live or not;
System.out.println("Thread Excution is completed");
	}
}
