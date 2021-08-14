class First
{
First()
{
	System.out.println("I am Parent class Constructor");
}
  void data()
  {
	  System.out.println("I am Using Super class");
  }
}

class second extends First
{
	second()
	{
		super();
		System.out.println("I am second Parent class Constructor");
	}
	void msg()
	{
		System.out.println("wsf");
	}
}

public class Cunstructor_Overloading {

	public static void main(String[] args) {
		

	}

}
