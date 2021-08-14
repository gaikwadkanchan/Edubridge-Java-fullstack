import java.util.*;
public class Addition {

	void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.print("the sum is" +z);
	}
	public static void main(String[] args) {
		Addition m=new Addition();
		m.sum();
}
}