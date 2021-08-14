
public class Throws {

	
		static void sum() throws ArithmeticException
		{
			int x=10;
			int y=0;
			int res=x/y;
			System.out.println(res);
			
			throw new ArithmeticException("Exception occure");
		}
		public static void main(String[] args) {
			try {
				sum();
			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
			finally
			{
				System.out.println("code is executed");
			}
	}

}
