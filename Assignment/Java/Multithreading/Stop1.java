
public class Stop1 {

	public static void main(String[] args)throws Exception {
		
		Thread t=new Thread(()->
		{
		for(int i=1;i<=5;i++)
		{
		System.out.println("kanchan " +Thread.currentThread().getName());	
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
		System.out.println("Gaikwad " +Thread.currentThread().getName());
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
			Thread.sleep(200);
		}catch(Exception e)
		{
			System.out.print(e);
			}
		
		t1.start();
		t1.stop();
		
	//System.out.println("Thread Excution is completed");
	}
}

