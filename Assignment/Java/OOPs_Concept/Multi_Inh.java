class Empl
{
	float salary=4000;
	void sal()
	{
		System.out.println("salary is 4000");
	}
}
class Permntemp extends Empl
{
	void hike()
	{
		System.out.println("The hike 0.5");
	}
}

class Temp_Emp  extends Permntemp
{
	void hike()
	{
		System.out.println("the hike is 0.10");
	}
}
public class Multi_Inh {

	public static void main(String[] args) {
		Permntemp p=new Permntemp();
		Temp_Emp t=new Temp_Emp();
		p.sal();
		t.hike();
		p.hike();
		
		

	}

}
