class Account1
{
	String name;
	long acc_no;
	Account1()
	{
		name="Kanchan";
		acc_no=102345;
	}
	void details()
	{
		System.out.println(acc_no+" "+name);
	}
}
	class Saving_Acc extends Account1
	{
		double amount;
		String type;
		Saving_Acc()
		{
		amount=100000;
		type="Saving account";
		}
		public void data()
		{
			System.out.println(acc_no+" "+name+" "+amount+" "+type);
		}
	}
	class Current_Acc extends Account1
	{
		double loan;
		Current_Acc()
		{
			loan=50000;
		}
		public void info()
		{
			System.out.println(acc_no+" "+name+" "+loan);
		}
	}
	public class Account
	{
	public static void main(String[] args) {
		Account1 a=new Account1();
		a.details();
		Saving_Acc s=new Saving_Acc();
		s.data();
		Current_Acc c=new Current_Acc();
		c.info();
	}

}
