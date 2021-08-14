
public class String1_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text;
text="Hellow,World";
char arr[]=text.toCharArray();
int i=0;
int length=arr.length;
while(i<length-1)
{
	if(arr[i]=='o')
	{
		System.out.println("O is present is at:" +i +"laoction");
	}
	else if(arr[i]==',')
	{
		System.out.println(", is present is at:" +i +"laoction");
	}
	i++;
   }
}

}
