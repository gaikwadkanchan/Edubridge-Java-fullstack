
public class Join_Metd {

	public static void main(String[] args) throws Exception{
		Thread t=new Thread(()->
		{
			int arr[]=new int[20];
			for(int i=1;i<=10;i++)
			{
				arr[i]=i*2;
			System.out.println(arr[i]);
			try {
			Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		});

		Thread t1=new Thread(()->   //lambda function
		{
			int arr[]=new int[20];
			for(int i=1;i<=10;i++)
			{
				arr[i]=i*3;
			System.out.println(arr[i]);
			try {
			Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}

		});
		
		t.start();
		try {
			Thread.sleep(500);
		}catch(Exception e)
		{
			System.out.print(e);
			}
		t1.start();
		t.join();
		t1.join();

System.out.println("Excution is completed");

	}

}
