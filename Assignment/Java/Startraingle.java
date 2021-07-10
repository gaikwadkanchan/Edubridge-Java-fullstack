//write program for draw * pyramid using nested loop
public class Startraingle {

	public static void main(String[] args)
	{
	
		for(int i=1;i<=5;i++)        //Outer loop
		{
			for(int j=4;j>=i;j--)    //Inner loop
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
		System.out.print("*");
		    }
		System.out.println("");
	}

}
}

/*
OUTPUT
    *
   ***
  *****
 *******
*********
*/