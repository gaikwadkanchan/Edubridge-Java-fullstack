import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Mastering_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0, avg=0, count=0;
		HashMap<Integer, Integer> h =new HashMap<Integer, Integer>();
		for(int i=0;i<n; i++)
		{
			h.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(h);
		
		Iterator<Integer> i = h.keySet().iterator();
		{
			while(i.hasNext())
			{
				int j=i.next();
				if(j % 2 !=0)
				{
					sum +=h.get(j);
					count++;
				}
			}
			avg=sum/count;
			System.out.println(avg);
		}
	}

}
