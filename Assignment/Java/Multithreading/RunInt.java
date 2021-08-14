class A implements Runnable
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
}

class B implements Runnable
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
}
public class RunInt {

	public static void main(String[] args) {
	A a=new A();
	B b=new B();
	
	Thread t=new Thread(a);
	t.start();
	Thread t1=new Thread(b);
	t1.start();
	}

}
