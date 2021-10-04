import java.util.Scanner;

public class PanCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur pan card no");
		String str = sc.next();
		getValues(str);
	}
	public static void getValues(String str)
	{
		if(str.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
