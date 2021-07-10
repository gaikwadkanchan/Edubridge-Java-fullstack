//Program
public class Alpha {

	public static void main(String[] args) {
		int a=65;
		for(int i=5;i>=0;i--)        //Outer loop
		{
			for(int j=5;j>=i;j--)    //Inner loop
			{
				System.out.print((char)(a+j));
			}
		System.out.println("\n");
		    }
	
	}

}

/*
OUTPUT
F

FE

FED

FEDC

FEDCB

FEDCBA
*/