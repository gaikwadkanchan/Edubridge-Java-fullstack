class Shapes {
	double area;
		Shapes()
		{
			
		}
		void Data()
		{
			System.out.println("I am in Shape class");
		}	
}
	class Circle extends Shapes
	{
		double rad=3;
		Circle()
		{
			double area=3.14*rad*rad;
		}
			public void area()
			{
				
				System.out.print("area is:" +area);
			}
		
	}
	class Square extends Shapes
	{
		double side=4;
		Square()
		{
			 area=side*side;
		}
			public void info()
			{
				
				System.out.print("area is:" +area);
			}
	}
	public class Shape
	{
	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.Data();
		Circle c1=new Circle();
		c1.area();
		Square s1=new Square();
		s1.info();
	}
}
