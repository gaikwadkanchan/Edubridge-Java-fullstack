class P
{
	int count;
	public void counter()
	{
	count++;
	}
}
public class Syn_Keyword {

	public static void main(String[] args) {
		P a=new P();
		a.counter();
		a.counter();
		a.counter();
		a.counter();
		a.counter();
		System.out.print("Value of count "+a.count);
	}

}
