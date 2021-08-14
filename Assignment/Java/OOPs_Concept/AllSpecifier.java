class College
	{
		private int id ;
		public String name;
		protected int age;
		String branch;
		
		public int getID()
		{
			return id;
		}
		public String getName()
		{
			
			return name;
		}
		protected int getAge()
		{
			return age;
		}
		String getBranch()
		{
			return branch;
		}
		void setBranch(String newValue)
		{
			branch=newValue;
		}
		protected void setAge(int newValue)
		{
			age=newValue;
		}
		public void setName(String newValue)
		{
			name=newValue;
		}
		public void setID(int newValue)
		{
			id=newValue;
		}
	}
	public class AllSpecifier 
	{
		public static void main(String[] args) 
		{
			College obj=new College();
			obj.setBranch("Computer");
			obj.setName("hidavi");
			obj.setAge(20);
			obj.setID(102);
			System.out.println("Student Branch :" +obj.getBranch());
			System.out.println("Student name :" +obj.getName());
			System.out.println("Student id :" +obj.getID());
			System.out.println("Student age :" +obj.getAge());
		}
	}
