
public class Interput1 
{
public static void main(String[] args) {
	Runnable r=()->
	{
for(int i=1;i<=5;i++)
{
System.out.println("java "+Thread.currentThread().getName());	
try {
	Thread.sleep(500);
}catch(Exception e)
{
	System.out.print(e);
	}
}

};
Runnable r1=()->   //lambda function
	{
for(int i=5;i<=10;i++)
{
System.out.println("Fullsatck "+Thread.currentThread().getName());
try {
	Thread.sleep(500);
}catch(Exception e)
{
	System.out.print(e);
	}
}

};

Thread t=new Thread(r);
t.start();
Thread t1=new Thread(r1);
t1.start();
t1.interrupt();
}
}
