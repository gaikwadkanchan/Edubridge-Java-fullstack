import java.util.Scanner;

public class Unique_Existing_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your first string");
		String str1=sc.nextLine();
		System.out.println("Enter Your second string");
		String str2=sc.nextLine();
		
		System.out.println(replacePlus(str1,str2));
	}
public static String replacePlus(String str1,String str2)
{
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	
	StringBuffer s= new StringBuffer();
	for(int i=0;i<str1.length();i++)
	{
		char c= str1.charAt(i);
		if(str2.indexOf(c)==-1)
		{
			s.append("+");
		}
		else
		{
			s.append(str1.charAt(i));
		}
	}
	return s.toString();
}
}
