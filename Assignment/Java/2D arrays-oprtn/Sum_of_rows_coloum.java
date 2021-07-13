//Sum of matrix rows and coloum

import java.util.*;
public class Sum_of_rows_coloum {

	public static void main(String[] args) {
		int arr[][]= { {10,20,30},
				       {40,50,60},
				       {70,80,90}};
	int rowsum,colsum,i,j;
  System.out.println("Row sum:");
  for(i=0;i<3;i++)
  {
	  rowsum=0;
  for(j=0;j<arr[i].length;j++)
  {
	  rowsum=rowsum+arr[i][j];
  }
  System.out.println("sum of:"+i+"row" +rowsum);
}
  
  System.out.println("Coloum sum:");
  for(i=0;i<3;i++)
  {
	  colsum=0;
  for(j=0;j<arr[i].length;j++)
  {
	  colsum= colsum+arr[i][j];
  }
  System.out.println("sum of:"+i+"coloum" + colsum);
	}

}
}

/*
OUTPUT
Row sum:
sum of:0row60
sum of:1row150
sum of:2row240
Coloum sum:
sum of:0coloum60
sum of:1coloum150
sum of:2coloum240
*/