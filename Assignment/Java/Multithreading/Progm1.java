class Sample extends Thread
{
public void run()     //data
{
for(int i=0;i<5;i++)
{
System.out.println("Exception handling work");
try {
Thread.sleep(1000);
}catch(Exception e)
{
	System.out.println(e);
}
}
}
}
class Mul extends Thread
{
public void run()   //data
{
for(int i=0;i<5;i++)
{
System.out.println("Multithreading");
try {
Thread.sleep(1000);
}catch(Exception e)
{
	System.out.println(e);
}
}
}
}

public class Progm1 {

	public static void main(String[] args) {
	Sample s=new Sample();
	//s.data();
	s.start();
	Mul m=new Mul();
	//m.data();
	m.start();
	
	}

}
