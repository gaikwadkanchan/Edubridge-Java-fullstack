
public class Progm3 {

	public static void main(String[] args) {
	
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
t.start();


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
t1.start();

	}

}

