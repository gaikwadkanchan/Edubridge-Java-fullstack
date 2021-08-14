class Data
{
void info()
{
System.out.println("information");	
}
}
class child extends Data
{
void show()
{
	System.out.println("data");		
}
}
public class Ins_for_inh {

	public static void main(String[] args) {
	Data d=new Data();
	child c=new child();

	System.out.println(d instanceof Data);
	System.out.println(c instanceof Data);
	System.out.println(c instanceof child);
	}

}
