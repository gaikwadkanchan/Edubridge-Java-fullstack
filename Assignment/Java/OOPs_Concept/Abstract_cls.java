//Program for abstract class
abstract class Data
{
	abstract void sum();
	void show()
	{
		System.out.println("Creating Abstract class");
	}
}
public class Abstract_cls extends Data
{
void sum()
{
	int a=10;
	int b=23;
	int c=a+b;
	System.out.println("sum is:" +c);
}
	public static void main(String[] args) {
		Abstract_cls a=new Abstract_cls();
		a.show();
		a.sum();
	}

}

/*
OUTPUT
Creating Abstract class
sum is:33
*/