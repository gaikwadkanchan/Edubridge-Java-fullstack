
public class sheduling {

	public static void main(String[] args) throws Exception {
		
		Thread t=new Thread(()->
		{
		for(int i=1;i<=5;i++)
		{
		System.out.println("kanchan");	
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
		
		//t.setPriority(1);
		//t.setPriority(10);
		t.setPriority(Thread.MIN_PRIORITY);
		t.setName("My Thread 1");
		System.out.println(t.getName());  //to give name for thread
		System.out.println(t.getPriority());
		t.start();
		//System.out.println(t.isAlive());
		try {
			Thread.sleep(200);
		}catch(Exception e)
		{
			System.out.print(e);
			}
		t1.start();
		//t.setPriority(5);
		t.setPriority(Thread.MAX_PRIORITY);
		t.setName("My Thread 2");
		System.out.println(t1.getName());
		System.out.println(t.getPriority());
		t.join();
		t1.join();
		System.out.println(t.isAlive());  //check for any thread is live or not;
System.out.println("Thread Excution is completed");
	}	}


