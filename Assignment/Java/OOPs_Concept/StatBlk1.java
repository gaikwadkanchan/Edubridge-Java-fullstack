public class StatBlk1 {
static int num;
static String mystr;

static
{
	System.out.println("First student Details");
	num=15;
	mystr="Kanchan";
}
static
{
	System.out.println("Second student Details");
	num=21;
	mystr="Radhika";
}
	public static void main(String[] args) {
		System.out.println("Student ID: "+num);
		System.out.println("Student name: "+mystr);
	}

}
