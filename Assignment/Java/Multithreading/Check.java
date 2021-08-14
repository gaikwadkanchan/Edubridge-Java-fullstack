
public class Check extends Thread 
{
public void run()
{
System.out.println(Thread.currentThread().getName()+ "Finished executing");	
}
	public static void main(String[] args)throws Exception
	{
		 Check t1=new  Check();
		 Check t2=new  Check();
		 t1.start();
		 t2.start();
		 t1.checkAccess();
		 System.out.println(t1.getName() + "has access");
		 t2.checkAccess();
		 System.out.println(t2.getName() + "has access");
	}

}
