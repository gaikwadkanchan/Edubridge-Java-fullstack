public class Is_Alive {

	public static void main(String[] args)throws Exception {
		
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
		
		t.start();
		//System.out.println(t.isAlive());
		System.out.println(t.getName());  //to give name for thread
		try {
			Thread.sleep(200);
		}catch(Exception e)
		{
			System.out.print(e);
			}
		t1.start();
		System.out.println(t1.getName());
		t.join();
		t1.join();
		System.out.println(t.isAlive());  //check for any thread is live or not;
System.out.println("Thread Excution is completed");
	}
}
