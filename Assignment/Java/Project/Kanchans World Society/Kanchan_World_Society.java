import java.io.*;
import java.util.*;

class Receptionist
{
	int Id;
	 String name,time;
	
void Receptionist_Info()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter id:");
Id=sc.nextInt();
System.out.print("Enter Name:");
name=sc.next();
System.out.print("Enter Timing:");
time=sc.next();
}

void show_Receptionist_Info()
{
	System.out.println(Id + "\t" + name + "    \t" + time );
}
}

class Hotel_Staff
{
	int SId, SAge;
	 String Sfirstname, Slastname, Stime;
void hotelstaff_Info()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter id:");
SId=sc.nextInt();
System.out.print("Enter FirstName:");
Sfirstname=sc.next();
System.out.print("Enter SurName:");
Slastname=sc.next();
System.out.print("Enter Age:");
SAge=sc.nextInt();
System.out.print("Enter Timing:");
Stime=sc.next();
}

void show_hotelstaff_Info()
{
	System.out.println(SId + "\t" + Sfirstname + "    \t"  + Slastname + "    \t"  + SAge + "    \t" + Stime );
}
}

class Singleroom  //implements Serializable
{
	int Id;
    String firstName;
    String lastName;
    String phoneNo;
    String Gender;   
    ArrayList<Food> food =new ArrayList<>();

   
    Singleroom()
    {
        this.firstName="";
    }
    Singleroom(int Id, String firstName, String lastName,String phoneNo,String Gender)
    {
    	this.Id=Id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNo=phoneNo;
        this.Gender=Gender;
    }
}
class Doubleroom extends Singleroom //implements Serializable
{ 
	String email;
	String address;
    
    Doubleroom()
    {
        this.firstName="";
        this.address="";
    }
   Doubleroom(int Id, String firstName, String lastName,String phoneNo,String Gender,String email,String address)
    {
	   this.Id=Id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNo=phoneNo;
        this.Gender=Gender;
        this.email=email;
        this.address=address;
    }
}
class NotAvailable extends Exception
{
    public String toString()
    {
        return "Not Available !";
    }
}

class holder //implements Serializable
{
    Doubleroom luxury_doublerrom[]=new Doubleroom[10]; 
    Doubleroom deluxe_doublerrom[]=new Doubleroom[20]; 
    Singleroom luxury_singleerrom[]=new Singleroom[10]; 
}

class Food
{
    int itemno;
    int quantity;   
    float price;
    
    Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        switch(itemno)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
        }
    }
}

class Guest
{
	static holder hotel_ob=new holder();
    static Scanner sc = new Scanner(System.in);
	
 static void New_Guest_Info(int i,int roomNo)   //int i,int roomNo
{
	 int Id,Age;  //,roomNo;
	 String firstName, lastName, Gender, address, phoneNo,email;
Scanner sc=new Scanner(System.in);
System.out.print("Enter id:");
Id=sc.nextInt();
System.out.print("Enter Name:");
firstName=sc.next();
System.out.print("Enter Surname:");
lastName=sc.next();
System.out.print("Enter Age:");
Age=sc.nextInt();
System.out.print("Enter Gender:");
Gender=sc.next();
System.out.print("Enter Address:");
address=sc.next();
System.out.print("Enter contact details:");
phoneNo=sc.next();
System.out.print("Enter EmailId:");
email=sc.next();

switch (i) {
case 1:hotel_ob.luxury_doublerrom[roomNo]=new Doubleroom(Id,firstName,lastName,Gender,phoneNo, email,address);
    break;
case 2:hotel_ob.deluxe_doublerrom[roomNo]=new Doubleroom(Id,firstName,lastName,Gender,phoneNo, email,address);
    break;
case 3:hotel_ob.luxury_singleerrom[roomNo]=new Singleroom(Id,firstName,lastName,Gender,phoneNo);
    break;
default:System.out.println("Wrong option");
    break;
}
}

static void features(int i)
{
    switch (i) {
        case 1:System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:3000 ");
            break;
        case 2:System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:2000  ");
            break;
        case 3:System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:1000  ");
            break;
        default:
            System.out.println("Enter valid option");
            break;
    }
}

static void availability(int i)
{
  int j,count=0;
    switch (i) {
        case 1:
            for(j=0;j<10;j++)
            {
                if(hotel_ob.luxury_doublerrom[j]==null)
                    count++;
            }
            break;
        case 2:
            for(j=0;j<hotel_ob.deluxe_doublerrom.length;j++)
            {
                if(hotel_ob.deluxe_doublerrom[j]==null)
                    count++;
            }
            break;
        case 3:
            for(j=0;j<hotel_ob.luxury_singleerrom.length;j++)
            {
                if(hotel_ob.luxury_singleerrom[j]==null)
                    count++;
            }
            break;
        default:
            System.out.println("Enter valid option");
            break;
    }
    System.out.println("Number of rooms available : "+count);
}

static void bookroom(int i)
{
    int j;
    int roomNo;
    System.out.println("\nChoose room number from : ");
    switch (i) {
        case 1:
            for(j=0;j<hotel_ob.luxury_doublerrom.length;j++)
            {
                if(hotel_ob.luxury_doublerrom[j]==null)
                {
                    System.out.print(j+1+",");
                }
            }
            System.out.print("\nEnter room number: ");
            try{
            	roomNo=sc.nextInt();
            	roomNo--;
            if(hotel_ob.luxury_doublerrom[roomNo]!=null)
                throw new NotAvailable();
            New_Guest_Info(i,roomNo);
            }
            catch(Exception e)
            {
                System.out.println("Invalid Option");
                return;
            }
            break;
        case 2:
             for(j=0;j<hotel_ob.deluxe_doublerrom.length;j++)
            {
                if(hotel_ob.deluxe_doublerrom[j]==null)
                {
                    System.out.print(j+11+",");
                }
            }
            System.out.print("\nEnter room number: ");
            try{
            	roomNo=sc.nextInt();
            	roomNo=roomNo-11;
            if(hotel_ob.deluxe_doublerrom[roomNo]!=null)
                throw new NotAvailable();
            New_Guest_Info(i,roomNo);
            }
            catch(Exception e)
            {
                System.out.println("Invalid Option");
                return;
            }
            break;
        case 3:
              for(j=0;j<hotel_ob.luxury_singleerrom.length;j++)
            {
                if(hotel_ob.luxury_singleerrom[j]==null)
                {
                    System.out.print(j+31+",");
                }
            }
            System.out.print("\nEnter room number: ");
            try{
            	roomNo=sc.nextInt();
            	roomNo=roomNo-31;
            if(hotel_ob.luxury_singleerrom[roomNo]!=null)
                throw new NotAvailable();
            New_Guest_Info(i,roomNo);
            }
            catch(Exception e)
            {
                System.out.println("Invalid Option");
                return;
            }
            break;
        default:
            System.out.println("Enter valid option");
            break;
    }
    System.out.println("Room Booked");
}

static void order(int roomNo,int rtype)
{
    int i,q;
    char wish;
     try{
         System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
    do
    {
        i = sc.nextInt();
        System.out.print("Quantity- ");
        q=sc.nextInt();
       
          switch(rtype){
        case 1: hotel_ob.luxury_doublerrom[roomNo].food.add(new Food(i,q));
            break;
        case 2: hotel_ob.deluxe_doublerrom[roomNo].food.add(new Food(i,q));
            break;
        case 3: hotel_ob.luxury_singleerrom[roomNo].food.add(new Food(i,q));
            break;                                                
    }
          System.out.println("Do you want to order anything else ? (y/n)");
          wish=sc.next().charAt(0); 
    }while(wish=='y'||wish=='Y');  
    }
     catch(NullPointerException e)
        {
            System.out.println("\nRoom not booked");
        }
     catch(Exception e)
     {
         System.out.println("Cannot be done");
     }
}


static void deallocate(int roomNo,int rtype)
{
    int j;
    char w;
    switch (rtype) {
        case 1:               
            if(hotel_ob.luxury_doublerrom[roomNo]!=null)
                System.out.println("Room used by "+hotel_ob.luxury_doublerrom[roomNo].firstName);                
            else 
            {    
                System.out.println("Empty Already");
                    return;
            }
            System.out.println("Do you want to checkout ?(y/n)");
             w=sc.next().charAt(0);
            if(w=='y'||w=='Y')
            {
                bill(roomNo,rtype);
                hotel_ob.luxury_doublerrom[roomNo]=null;
                System.out.println("Deallocated succesfully");
            }
            
            break;
        case 2:
            if(hotel_ob.deluxe_doublerrom[roomNo]!=null)
                System.out.println("Room used by "+hotel_ob.deluxe_doublerrom[roomNo].firstName);                
            else 
            {    
                System.out.println("Empty Already");
                    return;
            }
            System.out.println(" Do you want to checkout ?(y/n)");
             w=sc.next().charAt(0);
            if(w=='y'||w=='Y')
            {
                bill(roomNo,rtype);
                hotel_ob.deluxe_doublerrom[roomNo]=null;
                System.out.println("Deallocated succesfully");
            }
             
            break;
        case 3:
            if(hotel_ob.luxury_singleerrom[roomNo]!=null)
                System.out.println("Room used by "+hotel_ob.luxury_singleerrom[roomNo].firstName);                
            else 
             {    
                System.out.println("Empty Already");
                    return;
            }
            System.out.println(" Do you want to checkout ? (y/n)");
            w=sc.next().charAt(0);
            if(w=='y'||w=='Y')
            {
                bill(roomNo,rtype);
                hotel_ob.luxury_singleerrom[roomNo]=null;
                System.out.println("Deallocated succesfully");
            }
            
            break;
        default:
            System.out.println("\nEnter valid option : ");
            break;
    }
}

static void bill(int roomNo,int rtype)
{
    double amount=0;
    String list[]={"Sandwich","Pasta","Noodles","Coke"};
    System.out.println("\n*******");
    System.out.println(" Bill:-");
    System.out.println("*******");
           
    switch(rtype)
    {
        case 1:
            amount+=3000;
                System.out.println("\nRoom Charge - "+3000);
                System.out.println("\n===============");
                System.out.println("Food Charges:- ");
                System.out.println("===============");
                 System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for(Food obb:hotel_ob.luxury_doublerrom[roomNo].food)
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                }
                
            break;
        case 2:amount+=2000;
                System.out.println("Room Charge - "+2000);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                 System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for(Food obb:hotel_ob.deluxe_doublerrom[roomNo].food)
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                }
            break;
        case 3:amount+=1000;
                System.out.println("Room Charge - "+1000);
                System.out.println("\nFood Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for(Food obb:hotel_ob.luxury_singleerrom[roomNo].food)
                {
                    amount+=obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                }
            break;
        default:
            System.out.println("Not valid");
    }
    System.out.println("\nTotal Amount- "+amount);
}



}

public class Kanchan_World_Society {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count1=0,count2=0,count3=0;
		int i,j,S=1;
		int choice;
		 char wish;
		
		 Receptionist[] R = new Receptionist[100];
	        for (i = 0; i < 100; i++)
	            R[i] = new Receptionist();
		 
		Guest[] G = new Guest[100];
        for (i = 0; i < 100; i++)
            G[i] = new Guest();
        
        Hotel_Staff[] St = new Hotel_Staff[25];
        for (i = 0; i < 25; i++)
            St[i] = new Hotel_Staff();
		
		while(S==1)
		{
		System.out.println("-------*****WELCOME IN KANCHAN WORLD SOCIETY*****-------");
		System.out.println("-------------------------<<<MENU>>>-----------------------------");
		System.out.println("                                                    ");
		System.out.println("1.Display room details  2.Guest Details  3. Hotel Staff Details  4.Receptioninst Details");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Enter your choise");
		choice=sc.nextInt();

		switch(choice)
		{
		case 1:
		{
			System.out.println("1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n");
			System.out.println("\nChoose room type");
			int ch=sc.nextInt();
            Guest.features(ch);
			System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S = sc.nextInt();
			break;
		}
		case 2:
		{
			System.out.println("................................................................");
			System.out.println("                   **Guest Details**               ");
			System.out.println("................................................................");	
			S=1;
			while(S==1)
			{
			System.out.println("1.Add New Guest Registration Details");
			  System.out.println("enter ur choice");
	          int ch1=sc.nextInt();
			
			switch(ch1)
			{
			case 1:
			{
				int ch2;
				                         /*G[count1].New_Guest_Info();*/
				 x:
					 do{
				        System.out.println("Enter your choice");
				        System.out.println("1.Display room availability \n2.Book\n3.Order food\n4.Checkout\n5.Exit\n");
				        ch2 = sc.nextInt();
				        switch(ch2){
				            case 1:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n");
				                     ch2 = sc.nextInt();
				                    Guest.availability(ch2);
				                break;
				            case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n");
				                     ch2 = sc.nextInt();
				                     Guest.bookroom(ch2);                     
				                break;
				            case 3:
				                 System.out.print("Room Number -");
				                     ch2 = sc.nextInt();
				                     if(ch2>40)
				                         System.out.println("Room doesn't exist");
				                     else if(ch2>30)
				                         Guest.order(ch2-31,3);
				                     else if(ch2>10)
				                    	 Guest.order(ch2-11,2);
				                     else if(ch2>0)
				                    	 Guest.order(ch2-1,1);
				                     else
				                         System.out.println("Room doesn't exist");
				                     break;
				            case 4:                 
				                System.out.print("Room Number -");
				                     ch2 = sc.nextInt();
				                     if(ch2>40)
				                         System.out.println("Room doesn't exist");
				                     else if(ch2>30)
				                    	 Guest.deallocate(ch2-31,3);
				                     else if(ch2>10)
				                    	 Guest.deallocate(ch2-11,2);
				                     else if(ch2>0)
				                    	 Guest.deallocate(ch2-1,1);
				                     else
				                         System.out.println("Room doesn't exist");
				                     break;
				            case 5:
				            	break x;
				                
				        }
				           
				            System.out.println("\nContinue : (y/n)");
				            wish=sc.next().charAt(0); 
				            if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
				            {
				                System.out.println("Invalid Option");
				                System.out.println("\nContinue : (y/n)");
				                wish=sc.next().charAt(0); 
				            }
				            
				        }while(wish=='y'||wish=='Y');    
				
				break;
			}
			
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
             S = sc.nextInt();
			}
			break;
		}
		
		case 3:
		{
			System.out.println("................................................................");
			System.out.println("                    **Staff Details**               ");
			System.out.println("................................................................");	
			S=1;
			while(S==1)
			{
			System.out.println("1.Add New Staff Entry");
			System.out.println("2.Existing staff list");
			System.out.println("enter ur choise");
			int ch2=sc.nextInt();
			
			switch(ch2)
			{
			case 1:
			{
				St[count2].hotelstaff_Info();
				count2++;
				System.out.println(".......................................................................");
				System.out.println("SId \t Sfirstname \t Slastname  \t SAge \t Stime");
			   for (j = 0; j < count2; j++)
	           {
	               St[j].show_hotelstaff_Info();
	           }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
				System.out.println("SId \t Sfirstname \t Slastname  \t SAge \t Stime");
			   for (j = 0; j < count2; j++)
	           {
	               St[j].show_hotelstaff_Info();
	           }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S = sc.nextInt();
			}
		break;	
		}
		
		case 4:
		{
			System.out.println("................................................................");
			System.out.println("                    **Receptionist Details**               ");
			System.out.println("................................................................");	
			S=1;
			while(S==1)
			{
			System.out.println("1.Add New Receptionist Entry");
			System.out.println("2.Existing Receptionist list");
			System.out.println("enter ur choise");
			int ch3=sc.nextInt();
			
			switch(ch3)
			{
			case 1:
			{
				R[count3].Receptionist_Info();
				count3++;
				System.out.println(".......................................................................");
				System.out.println("Id \t name  \t time");
			   for (j = 0; j < count3; j++)
	           {
	               R[j].show_Receptionist_Info();
	           }
				break;
			}
			case 2:
			{
				System.out.println(".......................................................................");
				System.out.println("Id \t name  \t time");
			   for (j = 0; j < count3; j++)
	           {
	               R[j].show_Receptionist_Info();
	           }
			   break;
			}
			}
			 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
	         S = sc.nextInt();
			}
		break;	
		}
		
		 default:
         {
             System.out.println(" You Have Enter Wrong Choice!!");
         }
    }
 System.out.println("\nReturn to MAIN MENU Press 1");
 S = sc.nextInt();
	}
  }
}



/*static void show_Guest_info()
{
	System.out.println(Id + "\t" + firstName + "  \t" +lastName + "     \t" +Age + "   \t" + Gender + "  \t" + address + " \t" + phoneNo +  "\t"+ email);
}*/