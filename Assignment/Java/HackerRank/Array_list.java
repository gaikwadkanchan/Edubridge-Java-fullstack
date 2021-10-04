import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of arraylist");
		int s=sc.nextInt();
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		System.out.println("Enetr 1 list element");
		for(int i=0;i<s;i++)
		{
			al1.add(sc.nextInt());
		}
		System.out.println("Enetr 2 list element");
		for(int i=0;i<s;i++)
		{
			al2.add(sc.nextInt());
		}

		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3 = display(al1,al2);
		System.out.println("Output");
		
		Iterator<Integer> it = al3.iterator();
		while(it.hasNext());
		{
			int n=it.next();
		    System.out.println(n);	
		}
		
	}
	public static ArrayList<Integer> display(ArrayList<Integer> al1, ArrayList<Integer> al2)
	{
		
	}

}
