
public class Exc_throw {

	public static void main(String[] args) {
		int num=8,data=0;
		int result;
try {
	result=num/data;
	System.out.print(result);
	String str=null;
	System.out.print(str.length());
}		
catch(ArithmeticException e)
{
	System.out.print(e);
}
catch(Exception e)
{
	System.out.print(e);
}
	}

}
