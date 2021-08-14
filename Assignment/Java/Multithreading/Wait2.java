class AA
{
  int n;
  boolean flag=false;
   public synchronized void put(int n)
   {
   while(flag)
    {
     try {
	 wait();
     }
     catch(Exception e)
     {
       System.out.println(e);	
     }
   }
   System.out.println("put" +n);
   this.n=n;
   flag=true;
   notify();
}
public synchronized void get()
{
	 while(!flag)
	    {
	     try {
		 wait();
	     }catch(Exception e)
	{
	System.out.println(e);	
	}
	}
	System.out.println("get" +n);
	flag=false;
	notify();
	}	
}
public class Wait2 {

	public static void main(String[] args) {
	AA a=new AA();
	}

}
