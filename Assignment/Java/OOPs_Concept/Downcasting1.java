class A2
{
	void show()
{
	System.out.println("I am in class A2");
}
}
class B2 extends A2
{
	void show()
	{
		super.show();
		System.out.println("I am in class B2");
	}
}
public class Downcasting1 {

	public static void main(String[] args) {
	A2 a=new B2();
	B2 b1=(B2)a;
    a.show();
  //  b1.show();
	}

}
