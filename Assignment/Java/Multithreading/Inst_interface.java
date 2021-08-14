interface Data1
{
void info();	
}
public class Inst_interface implements Data1 {
public void info()
{
	System.out.println("information");	
}
	public static void main(String[] args) {
	Data1 d=new  Inst_interface();
	System.out.println(d instanceof Data);
	System.out.println(d instanceof  Inst_interface);
	}

}
