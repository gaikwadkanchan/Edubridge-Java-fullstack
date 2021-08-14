import java.util.*;
public class Methd_overloading {
	void sum(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	void sum(int x,int y, int z)
	{
		int k=x+y+z;
		System.out.println(k);
	}
	public static void main(String[] args) {
		Methd_overloading m=new Methd_overloading();
	m.sum(2,3);
	m.sum(4,5,6);
	
	}

}
