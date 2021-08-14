import java.util.*;
public class Stringchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur String");
		String str1=sc.nextLine();
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
				count++;
		}
	System.out.println("total no of character:" +count);	
	}

}
