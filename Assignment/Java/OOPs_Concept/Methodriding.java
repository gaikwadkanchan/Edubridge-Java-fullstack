//Program for Method Overiding
class P
{
	void show()
{
	System.out.print("I am in class A");
}
}
class Q extends P
{
	void show()
	{
		System.out.println("I am in class Q");
	}
}
class R extends P
{
	void show()
	{
		System.out.println("I am in class C");
	}
}
public class Methodriding {

	public static void main(String[] args) {
		/*
		 Q q=new Q();
		 q.show();
		 R r=new R();
		 r.show();
		 we also write this
		 */
		P q=new Q();  //Upcasting
		q.show();
		P r=new R();
        r.show();
	}

}

/*
output
I am in class Q
I am in class C
*/