import java.util.*;
public class String_Pall 
{
static Boolean isPalindrom(String str)
{
	int i=0,j=str.length()-1;
	while(i<j)
	{
		if(str.charAt(i)!=str.charAt(j))
			return false;
		i++;
		j--;
	}
	return false;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		if(isPalindrom(str))
		{
			System.out.println("is pallindrom");
		}
		else
		{
			System.out.println("is not pallindrom");
		}
	}

}
