class First1
{
	void data()
	{
		System.out.println("I am super class");
	}
}
class   Inheritance extends First1
{
	void msg()
	{
		System.out.println("I am sub class");
	}
	public static void main(String[] args) {
		 Inheritance ch=new  Inheritance();
		ch.data();
		ch.msg();

	}
}

