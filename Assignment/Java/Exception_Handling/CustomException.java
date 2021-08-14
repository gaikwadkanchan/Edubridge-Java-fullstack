class AgeLimitExceeded extends Exception
{
	AgeLimitExceeded(int x)
	{
		System.out.print(x);
	}
}

public class CustomException {
	void validAge(int age) throws AgeLimitExceeded
	{
		if(age>18 && age<=60)
			System.out.println("You are ready to join ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
