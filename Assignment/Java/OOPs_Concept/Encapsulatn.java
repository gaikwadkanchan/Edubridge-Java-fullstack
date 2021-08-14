class Emp
{
	private int id ;
	private String empName;
	private int age;
	
	public int getID()
	{
		return id;
	}
	public String getEmpName()
	{
		
		return empName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int newValue)
	{
		age=newValue;
	}
	public void setEmpName(String newValue)
	{
		empName=newValue;
	}
	public void setID(int newValue)
	{
		id=newValue;
	}
}
public class Encapsulatn 
{
	public static void main(String[] args) 
	{
		Emp obj=new Emp();
		obj.setEmpName("hidavi");
		obj.setAge(20);
		obj.setID(102);
		System.out.println("Emmployee name :" +obj.getEmpName());
		System.out.println("Emmployee id :" +obj.getID());
		System.out.println("Emmployee age :" +obj.getAge());
	}
}
