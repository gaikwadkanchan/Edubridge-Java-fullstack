import java.util.Scanner;

public class Vending_Mach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Coffee  \n2)Tea  \n3)Soup");
		System.out.println("Enter ur choise");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			System.out.println("Welcomr in CCD");
			System.out.println("1)Expresso coffe  \n2)Cappuccino coffee  \n3)Latte Coffee");
			System.out.println("Enter ur choise");
			int ch1=sc.nextInt();
			switch(ch1)
			{
			case 1:
			{
				System.out.println("Enjoy ur Expresso coffee");
				break;
			}
			case 2:
			{
				System.out.println("Enjoy ur Cappuccino coffee");
				break;
			}
			case 3:
			{
				System.out.println("Enjoy ur Latte Coffee");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}
			}
			break;
		}
		case 2:
		{
			System.out.println("Welcomr in Tea shop");
			System.out.println("n 1)Plain tea  \n2)Plain tea  \n3)Lemon tea");
			System.out.println("Enter ur choise");
			int ch1=sc.nextInt();
			switch(ch1)
			{
			case 1:
			{
				System.out.println("Enjoy ur Plain tea");
				break;
			}
			case 2:
			{
				System.out.println("Enjoy ur Plain tea");
				break;
			}
			case 3:
			{
				System.out.println("Enjoy ur Lemon tea");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}
			}
			break;
		}
		case 3:
		{
			System.out.println("Welcomr in soup");
			System.out.println("n 1)Tomato soup  \n2)Veg corn soup  \n3)hot and source soup");
			System.out.println("Enter ur choise");
			int ch1=sc.nextInt();
			switch(ch1)
			{
			case 1:
			{
				System.out.println("Enjoy ur Tomato soup ");
				break;
			}
			case 2:
			{
				System.out.println("Enjoy ur Veg corn soup");
				break;
			}
			case 3:
			{
				System.out.println("Enjoy ur hot and source soup");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}
			}
			break;
		}
		}

	}

}
