import java.util.Scanner;
public class Employee
{
	String name;
	int id;
void empdetail()
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Id of employee");
	 id=sc.nextInt();
	
	System.out.println("Enter the name of employee");
   name=sc.next();
}
void getdetail()
    {
	System.out.println("employee id is:"+id);
	System.out.println("the employee  name is:"+name);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empdetail();
		e.getdetail();
		
	}

}
