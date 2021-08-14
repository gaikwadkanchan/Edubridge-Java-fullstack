public class Nested_try {

	public static void main(String[] args) {
		try
		{
			try
			{
				int res=10/0;
				
			}
			catch(ArithmeticException e)
			{
				System.out.print(e);
			}
			try
			{
				int a[]=new int[5];
				a[5]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.print(e);	
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
