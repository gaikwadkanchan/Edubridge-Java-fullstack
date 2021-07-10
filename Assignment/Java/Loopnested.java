// Program for Nested loop to print digit

public class Loopnested {

	public static void main(String[] args) {
for(int i=1;i<=5;i++)        //Outer loop
{
	for(int j=1;j<=i;j++)    //Inner loop
	{
		System.out.print(i);
		//System.out.print(i);
		//System.out.print(j);
	}
System.out.println("\n");
    }
	}

}

/*
OUTPUT
1

22

333

4444

55555
*/