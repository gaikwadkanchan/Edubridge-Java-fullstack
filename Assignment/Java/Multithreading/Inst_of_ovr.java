class A3
{
	void show()
{
	System.out.println("I am in class A3");
}
}
class B3 extends A3
{
static	void show(A3 a)
	{
	if(a instanceof B3)
	{
		//super.show();
		B3 b=(B3)a;   //downcasting
		System.out.println("Downcasting performed");
	}
  }
}
public class Inst_of_ovr {

	public static void main(String[] args) {
		A3 a=new B3();
		B3.show(a);

	}

}
