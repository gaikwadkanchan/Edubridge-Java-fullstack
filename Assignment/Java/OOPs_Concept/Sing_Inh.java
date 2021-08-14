
class Info
{
	void Stud()
	{
		String name="kanchan";
		String collg_Name="SND";
			System.out.println("she is Student");
	}
}
class  Sing_Inh extends Info
{
	void Data()
	{
		String Branch="computer";
		System.out.println("she is computer branch student");
	}
	public static void main(String[] args) {
		Sing_Inh ch=new Sing_Inh();
		System.out.println("ch.name");
		System.out.println("ch.collg_Name");
		System.out.println("ch.Branch");
        ch.Stud();
        ch.Data();
	}
}
