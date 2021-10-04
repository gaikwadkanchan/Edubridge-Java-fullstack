import java.util.Scanner;

public class Kaprekar_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sq=n*n;
		
		String s=Integer.toString(sq);
		if(sq<9)
		{
			s="0"+s;
		}
		int l=s.length();
		int mid=l/2;
		String left = s.substring(0, mid);
		String right=s.substring(mid);
		int x =Integer.parseInt(left);
		int y =Integer.parseInt(right);
	
	if(x+y==n)
	{
		System.out.println(n +" is a Kaprekar number");
	}
	else
	{
		System.out.println(n +" is not a Kaprekar number");
	}
	}

}
