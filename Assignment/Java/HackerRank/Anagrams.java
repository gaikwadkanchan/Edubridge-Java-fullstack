import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your first string");
		String str1=sc.nextLine();
		System.out.println("Enter Your second string");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean result = Arrays.equals(arr1, arr2);
			if(result)
			{
				System.out.println(str1 + " and " + str2 + " Are Anagram");
			}
			else
			{
				System.out.println(str1 + " and " + str2 + " Are Not Anagram");
			}
		}
		else
		{
			System.out.println(str1 + " and " + str2 + " Are Not Anagram");
		}

	}

}
