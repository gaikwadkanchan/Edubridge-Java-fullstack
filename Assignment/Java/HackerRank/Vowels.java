import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur string");
		String str=sc.nextLine();
		String MaxVowelsWorld="";
		int vCount=0;
		
		for(String s: str.split(" "))
		{
			int count=0;
			for(char c : s.toLowerCase().toCharArray())
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					count++;
				}
			}
			if(count>vCount)
			{
				vCount=count;
				MaxVowelsWorld=s;
			}
		}
		System.out.println(MaxVowelsWorld);
	}

}
