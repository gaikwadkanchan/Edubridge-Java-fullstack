public class String_Red 
{
static boolean isWordPresent(String sentence,String word)
{
	String []s=sentence.split(" ");
	for(String temp :s)
	{
	if(temp.compareTo(word)==0)	
	{
		return true;
	}
	}
	return false;
}
	public static void main(String[] args)
	{
String s="This is red Book";
String word="red";

if(isWordPresent(s,word))
	System.out.println("Red is Present in given string");
else
	System.out.println("Red is Not Present in given string");
	}

}
