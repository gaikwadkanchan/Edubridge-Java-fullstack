import java.util.*;
public class Eception_try_catch {

	public static void main(String[] args) 
		throws ArrayIndexOutOfBoundsException
		{
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[8];
		try {
			for(int i=0;i<9;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
finally {
	System.out.println("code is exucuted");
}
	}

}
