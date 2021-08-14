public class StringFun 
{
	public static void main(String[] args)
	{
String str1="KANCHAN";
String str2="KANCHAN";
String str3="kanchan";
String str4="Jagruti";
String str5="VEDIKA";
String str6="Kartiki";
String str7="Kalyani";
String str8="Gaikwad";

System.out.println(str1.equals(str2));
System.out.println(str2.equals(str3));
System.out.println(str3.equals(str8));
System.out.println(str4.toUpperCase());
System.out.println(str5.toLowerCase());
System.out.println(str6.length());
System.out.println(str7.charAt(3));
System.out.println(str7.compareTo(str8));
System.out.println(str1.isEmpty());
System.out.println(str4.equals(str2));
System.out.println(str2.indexOf('N'));
	}

}
