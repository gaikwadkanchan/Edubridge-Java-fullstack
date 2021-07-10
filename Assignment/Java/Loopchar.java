//Nested loop for printing  Alphabet

public class Loopchar {

	public static void main(String[] args) {
for(int i=65;i<=69;i++)        //Outer loop
{
	for(int j=65;j<=i;j++)    //Inner loop
	{
		System.out.print((char)j);
		//System.out.print(i);
		//System.out.print(j);
	}
System.out.println("\n");
    }
	}

}

/*
OUTPUT
A

AB

ABC

ABCD

ABCDE
*/