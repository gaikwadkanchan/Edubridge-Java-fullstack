class X
{
	int n;
	public void put(int n)
	{
		System.out.println("put"+n);
		this.n=n;
	}
	
public void get()
{
	System.out.println("get"+n);	
}
}
class Y implements Runnable
{
X a;
public Y(X a)
{
this.a=a;
Thread t=new Thread(this,"Producer");
t.start();
}
public void run()
{
int i=0;
while(true)
{
a.put(i++);	
try {
	Thread.sleep(1000);
}catch(Exception e)
{
	System.out.println(e);
}
}
}
}
class Z implements Runnable
{
X a;
public Z(X a)
{
this.a=a;
Thread t=new Thread(this,"Consumer");
t.start();
}
public void run()
{
while(true)
{
a.get();
try {
	Thread.sleep(1000);
}catch(Exception e)
{
	System.out.println(e);
}
}
}
}
public class Wait1 {

	public static void main(String[] args) {
		X a=new X();
		new Y(a);
		new Z(a);
	}

}
