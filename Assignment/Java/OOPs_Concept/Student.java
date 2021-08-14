import java.util.*;
public class Student {
	String name;
	int Rno;
	void Stud_info() 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of student");
	name=sc.next();
	
	System.out.println("Enter the Roll no of student");
	Rno=sc.nextInt();
	}
	
	void get_Stud_info()
	{
		System.out.println("Enter the name of student:" +name);
		System.out.println("Enter the Roll no of student:" +Rno);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.Stud_info() ;
		s.get_Stud_info();
	}

}

/*
OUTPUT

Enter the name of student
Kanchan
Enter the Roll no of student
01
Enter the name of student:Kanchan
Enter the Roll no of student:1
*/