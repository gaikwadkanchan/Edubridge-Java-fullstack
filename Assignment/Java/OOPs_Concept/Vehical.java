class Vehicle
{
	String model;
	double price,veh_no;
	Vehicle()
	{
		model="hyundai";
		price=120000;
		veh_no=6853;
	}
  public void info(String model,double price,double veh_no)
  {
	System.out.print(model+" "+price+" "+veh_no);
  }
}
class Bus extends Vehicle
{
	String colour;
	Bus()
	{
		colour="white";
	}
		void businfo()
		{
			System.out.println(model+" "+price+" "+veh_no+" "+colour);
		}	
}
class Car extends Vehicle
{
	String colour;
	Car()
	{
		colour="Red";
	}
		void Carinfo()
		{
			//super.info();
			System.out.println(model+" "+price+" "+veh_no+" "+colour);
		}	
}
public class Vehical {
	public static void main(String[] args) {
		Bus b=new Bus();
		b.businfo();
		Car c=new Car();
		c.Carinfo();
	}

}
