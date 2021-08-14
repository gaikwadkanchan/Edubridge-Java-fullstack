class A1
{
	void show()
{
	System.out.println("I am in class A1");
}
}
class B1 extends A1
{
	void show()
	{
		super.show();
		System.out.println("I am in class B1");
	}
}
class C1 extends A1
{
	void show()
	{
		System.out.println("I am in class C1");
	}
}
public class MthdOver {

	public static void main(String[] args) {
		
		A1 a=new B1();  
		a.show();
		A1 a1=new C1();
        a1.show();
	}
 }
