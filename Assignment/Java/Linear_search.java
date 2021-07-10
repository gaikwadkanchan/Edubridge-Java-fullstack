//Program for Linear_search

import java.util.*;
public class Linear_search {

	public static void main(String[] args) 
	{
		int i,num,item;
		int arr[];
        Scanner sc = new Scanner(System.in);    
         
     System.out.println("Enter the no of elements");
     num=sc.nextInt();
     arr= new int[num];
     
     System.out.println("Enter" +num+ "integer");
     for(i=0;i<num;i++)
     {
         arr[i] = sc.nextInt();
     }
     System.out.println("Enter the search value");
     item=sc.nextInt();
     
     for(i=0;i<num;i++)
     {
    	 if(arr[i]==item)
    	 {
    		 System.out.println(item+ "is present at location"+(i+1)); 
    		 break;
    	 }
    	 
     }
    
	}

}

/*
OUTPUT
Enter the no of elements
5
Enter5integer
11
12
13
14
15
Enter the search value
13
13is present at location3
*/