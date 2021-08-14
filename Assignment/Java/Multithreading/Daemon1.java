public class Daemon1 extends Thread
{
public void run()     //data
{
if(Thread.currentThread().isDaemon())
{
System.out.println("Service thread"+Thread.currentThread().getName());
}
else
{
	System.out.println("Service thread"+Thread.currentThread().getName());
}
}
	public static void main(String[] args) {
		Daemon1 d=new Daemon1();
		Daemon1 d1=new Daemon1();
		Daemon1 d2=new Daemon1();
		Daemon1 d3=new Daemon1();
		
d.start();
d1.setDaemon(true);
d2.start();
d3.start();
	}
}