import java.util.*;

public class ArrayList_SetOperation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no that u want to insert in each list");
		int n=Integer.parseInt(sc.nextLine());
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		System.out.println("Enetr 1 list element");
		for(int i=0;i<n;i++)
		{
			al.add(Integer.parseInt(sc.nextLine()));
		}
		System.out.println("Enetr 2 list element");
		for(int i=0;i<n;i++)
		{
			al1.add(Integer.parseInt(sc.nextLine()));
		}
		System.out.println("Enter ur choise from this :\n 1)Union(+) \n 2)Intersection(*) \n 3)Diff(-)");
		char c=sc.nextLine().charAt(0);
		
		System.out.println(getvalues(al,al1,c));
	}
		
		public static ArrayList<Integer> getvalues(ArrayList<Integer> al, ArrayList<Integer> al1, char c)
				{
			ArrayList<Integer> op=new ArrayList<Integer>();
			int k=0;
			switch(c)
			{
			case '+':
				al.removeAll(al1);
				al.addAll(al1);
				op=al;
				break;
				
			case '*':
				al.retainAll(al1);
				op=al;
				break;
				
			case '-':
				for(int i=0;i<al.size();i++)
				{ 
					k=0;
					for(int j=0;j<al1.size();j++)
					{
					if(al.get(i)==al1.get(j))
						k=1;
					}
					if(k==0)
						op.add(al.get(i));
				}
				break;
		 }
			return op;
	}
		
}	
		
		
		
		
		
		
		
		
		
		/*ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(11);
		al.add(13);
		al.add(14);
		al.add(16);
		al.add(17);
		al.add(19);

		ArrayList<Integer> al1=new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(15);
		al.add(16);
		al.add(18);
		al.add(19);*/
		
	