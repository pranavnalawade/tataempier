import java.util.*;
import java.util.Scanner;
import java.util.Random;
class TATA
{
      private String TataAuto_name;
	private int TataAuto_PhoneNo;
	private String TataAuto_email;p
    public String getTataAuto_name() 
	{
		return TataAuto_name;
	}
	public void setTataAuto_name(String tataAuto_name)
	{
		TataAuto_name = tataAuto_name;
	}
	public int getTataAuto_PhoneNo()
	{
		return TataAuto_PhoneNo;
	}
	public void setTataAuto_PhoneNo(int tataAuto_PhoneNo)
	{
		TataAuto_PhoneNo = tataAuto_PhoneNo;
	}
	public String getTataAuto_email()
	{
		return TataAuto_email;
	}
	public void setTataAuto_email(String tataAuto_email)
	{
		TataAuto_email = tataAuto_email;
	}
 
   
}

class TataRetail extends TATA
{
  public static void TataRetail()
  { 
    System.out.println("welcome to TataRetail");
    Scanner s = new Scanner(System.in);
    System.out.println("Select choice: 1) TataSonata 2) TataTanishq");
    int choice = s.nextInt();
     switch(choice)
     {
        case 1: TataSonata t = new TataSonata();
        t.TataSonata();
        break;
        case 2: TataTanishq t1 =new TataTanishq();
        t1.TataTanishq();
        break;
       default:System.out.println("Invalid Choice");
     }
  }    
}
class TataSonata extends TataRetail
{
   public static void TataSonata()
   {
    System.out.println("WELCOME TO TATASONATA");
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your wrist size: 1) S 2) M 3) L 4) XL");
      int size = s.nextInt();
      switch(size)
      {
        case 1: System.out.println("You Choose Wrist size: S");
        TataSonata1();
        break;
        case 2: System.out.println("You Choose Wrist size: M");
        TataSonata1();
        break;
        case 3:System.out.println("You Choose Wrist size: L");
        TataSonata1();
        break;
        case 4: System.out.println("You Choose Wrist size: XL");
        TataSonata1();
        break;
        default:System.out.println("Invalid Choice");
      }
   }
     public static void TataSonata1()
     { 
       Scanner c = new Scanner(System.in);
       System.out.println("Enter your Colour: 1) Black  2) White 3) Golden 4) Silver");
       int colour = c.nextInt();
       switch(colour)
       {
        case 1: System.out.println("You Choose: Black");
        break;
        case 2: System.out.println("You Choose: White");
        break;
        case 3:System.out.println("You Choose: Golden");
        break;
        case 4: System.out.println("You Choose : Silver");
        break;
        default:System.out.println("Invalid Choice");
       }
        System.out.println("Congratulation your order for TATASONATA WATCH successful :)");
   }
   }
class TataTanishq extends TataRetail
{
    public static void TataTanishq()
    {
       System.out.println("WELCOME TO TATATANISHQ");
       Scanner t= new Scanner(System.in);
       System.out.println("What you want?: 1) Gold 2) Silver 3) Platinum ");
       int type = t.nextInt();
       switch(type)
       {
        case 1: System.out.println("You Choose: Gold");
        TataTanishq1();
        break;
        case 2: System.out.println("You Choose: Silver");
        TataTanishq1();
        break;
        case 3:System.out.println("You Choose: Platinum");
        TataTanishq1();
        break;
        default:System.out.println("Invalid Choice");
       }
       }
       public static void TataTanishq1()
       {
       Scanner t1= new Scanner(System.in);
        System.out.println("Select your Jewellery Type: 1) Neck 2) Arms 3) Hands 4) Feet ");
          int type1 = t1.nextInt();
          switch(type1) 
           {
              case 1: System.out.println("You Choose: Neck");
              break;
              case 2: System.out.println("You Choose: Arms");
              break;
              case 3:System.out.println("You Choose: Hands");
              break;
              case 4:System.out.println("You Choose: Feet");
              break;
              default:System.out.println("Invalid Choice");
           } 
       System.out.println("Congratulation your order for TATATANISHQ JEWELLERY successful :)");
       } 
    }
class TataAuto extends TATA
{
     
   public static void TataAuto()
   {
    System.out.println("welcome to TataAuto");
    Scanner s = new Scanner(System.in);
    System.out.println("Select choice: 1) TataLandrover 2) TataMoters");
     int choice = s.nextInt();
     switch(choice)
     {
      case 1: TataLandrover a = new TataLandrover();
      a.TataLandrover();
      break;
      case 2: TataMotors a1= new TataMotors();
      a1.TataMotors();
      break;
      default:System.out.println("Invalid Choice");
     }
   }
}
class TataLandrover extends TataAuto
{
   public static void TataLandrover()
   {
      System.out.println("WELCOME TO TATALANDROVER");
      Scanner s = new Scanner(System.in);
      System.out.println("Select choice: 1) TataLandroverDefender 2) TataLandroverDiscovery");
      int choice = s.nextInt();
     switch(choice)
     {
        case 1: TataLandroverDefender t = new TataLandroverDefender();
        t.TataLandroverDefender();
        break;
        case 2: TataLandroverDiscovery t1 =new TataLandroverDiscovery();
        t1.TataLandroverDiscovery();
        break;
       default:System.out.println("Invalid Choice");
     }
   }
}
class  TataLandroverDefender extends TataLandrover 
{
    public static void TataLandroverDefender()
    {
      System.out.println("Welcome To TataLandroverDefender ");
      Scanner s = new Scanner(System.in);
      System.out.println("Select Models: 1)Defender 90 HSE 2) Defender 90 X 3) Defender 90 V8  ");
      int model = s.nextInt();
      switch(model)
      {
          case 1: System.out.println("You Choose: Defender 90 HSE");
          TataLandroverDefender1();
          break;
          case 2: System.out.println("You Choose: Defender 90 X");
          TataLandroverDefender1();
          break;
          case 3:System.out.println("You Choose: Defender 90 V8");
          TataLandroverDefender1();
          break;
          default:System.out.println("Invalid Choice");
      }
    }
      public static void TataLandroverDefender1()
      {
      System.out.println("Select colour: 1) Hakuba Silver 2) Yulong White 3) Eiger Grey ");
      Scanner s2= new Scanner(System.in);
      int colour =s2.nextInt();
      switch(colour)
      {
              case 1: System.out.println("You Choose: Hakuba Silver");
              break;
              case 2: System.out.println("You Choose: Yulong White");
              break;
              case 3:System.out.println("You Choose: Eiger Grey");
              break;
              default:System.out.println("Invalid Choice");
      }
        TataLandroverDefender ref = new TataLandroverDefender();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name");
		System.out.println("Enter PhoneNo");
		System.out.println("Enter email");
		String choice = s1.nextLine();
		int choice1 = s1.nextInt();
		String choice2 = s1.next();
		ref.setTataAuto_name(choice);
		ref.setTataAuto_PhoneNo(choice1);
		ref.setTataAuto_email(choice2);
		System.out.println("name:"+ref. getTataAuto_name());
		System.out.println("PhoneNo:"+ref.getTataAuto_PhoneNo());
		System.out.println("email:"+ref. getTataAuto_email());

      System.out.println("Congratulations your order for TataLandroverDefender successful");

    }
}
class TataLandroverDiscovery extends TataLandrover 
{
    public static void TataLandroverDiscovery()
    {
        System.out.println("Welcome to TataLandroverDiscovery ");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Select Models: 1)Discovery D300 Automatic 2) Discovery P360 Automatic");
        int model1 = s2.nextInt();
         switch(model1)
      {
          case 1: System.out.println("You Choose: Discovery D300 Automatic");
          TataLandroverDiscovery1();
          break;
          case 2: System.out.println("You Choose: Discovery P360 Automatic");
          TataLandroverDiscovery1();
          break; 
          default:System.out.println("Invalid Choice");
    }
    }
     public static void TataLandroverDiscovery1()
     {
      System.out.println("Select colour: 1) Latau Bronze 2) Silicion Silver  3) Portofino Blue ");
      Scanner s3 = new Scanner(System.in);
      int colour =s3.nextInt();
      switch(colour)
      {
              case 1: System.out.println("You Choose: Latau Bronze");
              break;
              case 2: System.out.println("You Choose: Silicion Silver");
              break;
              case 3:System.out.println("You Choose: Portofino Blue");
              break;
              default:System.out.println("Invalid Choice");
      }
     TataLandroverDiscovery ref = new TataLandroverDiscovery();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name");
		System.out.println("Enter PhoneNo");
		System.out.println("Enter email");
		String choice = s1.nextLine();
		int choice1 = s1.nextInt();
		String choice2 = s1.next();
		ref.setTataAuto_name(choice);
		ref.setTataAuto_PhoneNo(choice1);
		ref.setTataAuto_email(choice2);
		System.out.println("name:"+ref. getTataAuto_name());
		System.out.println("PhoneNo:"+ref.getTataAuto_PhoneNo());
		System.out.println("email:"+ref. getTataAuto_email());

     System.out.println("Congratulations your order for TataLandroverDiscovery successful");    
}
}
class TataMotors extends TataAuto
{
    public static void TataMotors()
   {
      System.out.println("WELCOME TO TATAMotors");
      Scanner s = new Scanner(System.in);
      System.out.println("Select choice: 1) TataMotorsNexon 2) TataMotorsPunch");
      int choice = s.nextInt();
     switch(choice)
     {
        case 1: TataMotorsNexon t = new TataMotorsNexon();
        t.TataMotorsNexon();
        break;
        case 2: TataMotorsPunch t1 =new TataMotorsPunch();
        t1.TataMotorsPunch();
        break;
       default:System.out.println("Invalid Choice");
     }
   }
}
class  TataMotorsNexon extends TataMotors 
{
    public static void TataMotorsNexon()
    {
      System.out.println("Welcome To TataMotorsNexon ");
      Scanner s = new Scanner(System.in);
      System.out.println("Select Models: 1)Nexon XE 2) Nexon XZ+ 3) Nexon XM ");
      int model = s.nextInt();
      switch(model)
      {
          case 1: System.out.println("You Choose: Nexon XE");
          TataMotorsNexon1();
          break;
          case 2: System.out.println("You Choose: Nexon XZ+");
          TataMotorsNexon1();
          break;
          case 3:System.out.println("You Choose: Nexon XM");
          TataMotorsNexon1();
          break;
          default:System.out.println("Invalid Choice");
      }
    }
      public static void TataMotorsNexon1()
      {
      System.out.println("Select colour: 1) Royal Blue 2) Atlas Black 3) Foliage Green ");
      Scanner s2= new Scanner(System.in);
      int colour =s2.nextInt();
      switch(colour)
      {
              case 1: System.out.println("You Choose: Royal Blue");
              break;
              case 2: System.out.println("You Choose: Atlas Black");
              break;
              case 3:System.out.println("You Choose: Foliage Green");
              break;
              default:System.out.println("Invalid Choice");
      }
       TataMotorsNexon ref = new TataMotorsNexon();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name");
		System.out.println("Enter PhoneNo");
		System.out.println("Enter email");
		String choice = s1.nextLine();
		int choice1 = s1.nextInt();
		String choice2 = s1.next();
		ref.setTataAuto_name(choice);
		ref.setTataAuto_PhoneNo(choice1);
		ref.setTataAuto_email(choice2);
		System.out.println("name:"+ref. getTataAuto_name());
		System.out.println("PhoneNo:"+ref.getTataAuto_PhoneNo());
		System.out.println("email:"+ref. getTataAuto_email());

      System.out.println("Congratulations your order for TataMotorsNexon successful");

    }
}
class TataMotorsPunch extends TataMotors 
{
    public static void TataMotorsPunch()
    {
        System.out.println("Welcome to TataMotorsPunch ");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Select Models: 1)Punch Pure 2) Punch Adventure AMT");
        int model1 = s2.nextInt();
         switch(model1)
      {
          case 1: System.out.println("You Choose: Punch Pure");
          TataMotorsPunch1();
          break;
          case 2: System.out.println("You Choose: Punch Adventure AMT");
          TataMotorsPunch1();
          break; 
          default:System.out.println("Invalid Choice");
    }
    }
     public static void TataMotorsPunch1()
     {
      System.out.println("Select colour: 1) Tornado Blue 2) Calypso Red  3) Meteror Bronze  ");
      Scanner s3 = new Scanner(System.in);
      int colour =s3.nextInt();
      switch(colour)
      {
              case 1: System.out.println("You Choose: Tornado Blue");
              break;
              case 2: System.out.println("You Choose: Calypso Red");
              break;
              case 3:System.out.println("You Choose: Meteror Bronze");
              break;
              default:System.out.println("Invalid Choice");
      }
      TataMotorsPunch ref = new TataMotorsPunch();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name");
		System.out.println("Enter PhoneNo");
		System.out.println("Enter email");
		String choice = s1.nextLine();
		int choice1 = s1.nextInt();
		String choice2 = s1.next();
		ref.setTataAuto_name(choice);
		ref.setTataAuto_PhoneNo(choice1);
		ref.setTataAuto_email(choice2);
		System.out.println("name:"+ref. getTataAuto_name());
		System.out.println("PhoneNo:"+ref.getTataAuto_PhoneNo());
		System.out.println("email:"+ref. getTataAuto_email());

     System.out.println("Congratulations your order for TataMotorsPunch successful"); 
}
}

class TataTravel extends TATA
{
    public static void TataTravel()
    {
   System.out.println("welcome to TataTravel");
   Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataAirasia 2) TataVivanta");

     int choice = s.nextInt();
     switch(choice)
     {
      case 1: TataAirasia t= new TataAirasia();
      t.TataAirasia();
      break;
      case 2: TataVivanta t1 = new TataVivanta();
      t1.TataVivanta();
      break;
      default:System.out.println("Invalid Choice");
     }
   
   }
}
class TataAirasia extends TataTravel
{
    private String TataAirasia_Boarding;
	private String TataAirasia_Destination;
	private String TataAirasia_Date;
	private int TataAirasia_seat;
	private int TataAirasia_GeneratedNo;
	private String TataAirasia_Name;
	private String TataAirasia_email;
    private int TataAirasia_PhoneNo;

	
	public String getTataAirasia_Boarding()
	{
		return TataAirasia_Boarding;
	}

	public void setTataAirasia_Boarding(String tataAirasia_Boarding)
	{
		TataAirasia_Boarding = tataAirasia_Boarding;
	}

	public String getTataAirasia_Destination()
	{
		return TataAirasia_Destination;
	}

	public void setTataAirasia_Destination(String tataAirasia_Destination)
	{
		TataAirasia_Destination = tataAirasia_Destination;
	}

	public String getTataAirasia_Date()
	{
		return TataAirasia_Date;
	}

	public void setTataAirasia_Date(String tataAirasia_Date) 
	{
		TataAirasia_Date = tataAirasia_Date;
	}

	public int getTataAirasia_seat() 
	{
		return TataAirasia_seat;
	}

	public void setTataAirasia_seat(int tataAirasia_seat)
	{
		TataAirasia_seat = tataAirasia_seat;
	}

	public int getTataAirasia_GeneratedNo() 
	{
		return TataAirasia_GeneratedNo;
	}

	public void setTataAirasia_GeneratedNo(int tataAirasia_GeneratedNo)
	{
		TataAirasia_GeneratedNo = tataAirasia_GeneratedNo;
	}

	public String getTataAirasia_Name()
	{
		return TataAirasia_Name;
	}

	public void setTataAirasia_Name(String tataAirasia_Name)
	{
		TataAirasia_Name = tataAirasia_Name;
	}

	public String getTataAirasia_email()
	{
		return TataAirasia_email;
	}

	public void setTataAirasia_email(String tataAirasia_email)
	{
		TataAirasia_email = tataAirasia_email;
	}

	public int getTataAirasia_PhoneNo()
	{
		return TataAirasia_PhoneNo;
	}

	public void setTataAirasia_PhoneNo(int tataAirasia_PhoneNo)
	{
		TataAirasia_PhoneNo = tataAirasia_PhoneNo;
	}

   public static void TataAirasia()
   {
      System.out.println("WELCOME TO TataAirasia");
      Scanner s = new Scanner(System.in);
      System.out.println("Select choice: 1) Book Ticket 2) Cancel Ticket");
      int choice = s.nextInt();
      switch(choice)
     {
        case 1: BookTicket t = new BookTicket();
        t.BookTicket();
        break;
        case 2: CancelTicket t1 =new CancelTicket();
        t1.CancelTicket();
        break;
       default:System.out.println("Invalid Choice");
     }
   }
}
class  BookTicket extends TataAirasia
{
    public static void BookTicket()
    {
      System.out.println("Welcome To Booking Section ");
      Scanner s = new Scanner(System.in);
      System.out.println("Select Section: 1) Economy 2) Business 3) Premium Economy 4) First Class ");
      int model = s.nextInt();
      switch(model)
      {
          case 1: System.out.println("You Choose: Economy");
          BookTicket1();
          break;
          case 2: System.out.println("You Choose: Business");
          BookTicket1();
          break;
          case 3:System.out.println("You Choose:  Premium Economy");
          BookTicket1();
          break;
          case 4:System.out.println("You Choose:  First Class");
          BookTicket1();
          break;
          default:System.out.println("Invalid Choice");
      }
    }
      public static void BookTicket1()
      {
         BookTicket ref = new BookTicket();
        Scanner s = new Scanner(System.in);
        System.out.println("Boarding From:");
        System.out.println("Destination:");
        System.out.println("Date in formate of dd-mm-yy:");
        System.out.println("Seat:");
        System.out.println("Name:");
        System.out.println("Email:");
        System.out.println("PhoneNo:");

        String b = s.next();
        String d = s.next();
        String d1 = s.next();
        int s1 = s.nextInt();
        Random r= new Random();
        int g = r.nextInt(1000000000);
        String n = s.next();
        String e= s.next();
        int p = s.nextInt();

        ref.setTataAirasia_Boarding(b);
        ref.setTataAirasia_Destination(d);
        ref.setTataAirasia_Date(d1);
        ref.setTataAirasia_seat(s1);
        ref.setTataAirasia_GeneratedNo(g);
        ref.setTataAirasia_Name(n);
        ref.setTataAirasia_email(e);
        ref.setTataAirasia_PhoneNo(p);

        System.out.println("Boarding From:"+ref.getTataAirasia_Boarding());
        System.out.println("Destination:"+ref.getTataAirasia_Destination());
        System.out.println("Date:"+ref.getTataAirasia_Date());
        System.out.println("seat:"+ref.getTataAirasia_seat());
        System.out.println("GeneratedNo:"+ref.getTataAirasia_GeneratedNo());
        System.out.println("Name:"+ref.getTataAirasia_Name());
        System.out.println("Email:"+ref.getTataAirasia_email());
        System.out.println("PhoneNo:"+ref.getTataAirasia_PhoneNo());
       
      

              System.out.println("Congratulations your Ticket for TataAirAsia Booked");

    }
}
 class CancelTicket extends TataAirasia
{
    public static void CancelTicket()
    {
        System.out.println("Welcome to CancelTicket ");
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter GenretedNo:");
        int model1 = s2.nextInt();
         System.out.println("GeneretedNo:"+model1);
          
          CancelTicket1();

    }
     public static void CancelTicket1()
     {
      System.out.println("Choose Preferred Option : 1) Placed By Mistake 2) Date issue  3) Others  ");
      Scanner s3 = new Scanner(System.in);
      int colour =s3.nextInt();
      switch(colour)
      {
              case 1: System.out.println("You Choose: Placed By Mistake");
              break;
              case 2: System.out.println("You Choose: Date issue ");
              break;
              case 3:System.out.println("You Choose: Others");
              break;
              default:System.out.println("Invalid Choice");
      }
      
     System.out.println("Thank you for your time your ticket has been cancelled. Have a grat Day :)"); 
}

}
 class TataVivanta extends TataTravel
 {
   public static void TataVivanta()
   {
    System.out.println("WELCOME TO TataVivanta");
    Scanner s = new Scanner(System.in);
      System.out.println("Select choice: 1) Book Hotel 2) Cancel Hotel");
      int choice = s.nextInt();
      switch(choice)
     {
        case 1: BookHotel t = new BookHotel();
        t.BookHotel();
        break;
        case 2: CancelHotel t1 =new CancelHotel();
        t1.CancelHotel();
        break;
       default:System.out.println("Invalid Choice");
     }
   }
 }
 class BookHotel extends TataVivanta
 {
private String TataVivanta_FromDate;
   private String TataVivanta_ToDate;
   private int TataVivanta_Rooms;
   private int TataVivanta_Adults;
   private int TataVivanta_Children;
   private String TataVivanta_Name;
   private String TataVivanta_Email;
   private int TataVivanta_PhoneNo;
   private int TataVivanta_RefNo;

	public String getTataVivanta_FromDate()
	{
	 return TataVivanta_FromDate;
    }
	
  public void setTataVivanta_FromDate(String tataVivanta_FromDate)
{
	TataVivanta_FromDate = tataVivanta_FromDate;
}

public String getTataVivanta_ToDate() 
{
	return TataVivanta_ToDate;
}

public void setTataVivanta_ToDate(String tataVivanta_ToDate)
{
	TataVivanta_ToDate = tataVivanta_ToDate;
}

public int getTataVivanta_Rooms()
{
	return TataVivanta_Rooms;
}

public void setTataVivanta_Rooms(int tataVivanta_Rooms)
{
	TataVivanta_Rooms = tataVivanta_Rooms;
}

public int getTataVivanta_Adults()
{
	return TataVivanta_Adults;
}

public void setTataVivanta_Adults(int tataVivanta_Adults)
{
	TataVivanta_Adults = tataVivanta_Adults;
}

public int getTataVivanta_Children()
{
	return TataVivanta_Children;
}

public void setTataVivanta_Children(int tataVivanta_Children)
{
	TataVivanta_Children = tataVivanta_Children;
}

public String getTataVivanta_Name()
{
	return TataVivanta_Name;
}

public void setTataVivanta_Name(String tataVivanta_Name)
{
	TataVivanta_Name = tataVivanta_Name;
}

public String getTataVivanta_Email()
{
	return TataVivanta_Email;
}

public void setTataVivanta_Email(String tataVivanta_Email) 
{
	TataVivanta_Email = tataVivanta_Email;
}

public int getTataVivanta_PhoneNo()
{
	return TataVivanta_PhoneNo;
}

public void setTataVivanta_PhoneNo(int tataVivanta_PhoneNo)
{
	TataVivanta_PhoneNo = tataVivanta_PhoneNo;
}
  public int getTataVivanta_RefNo()
  {
	return TataVivanta_RefNo;
    }

   public void setTataVivanta_RefNo(int tataVivanta_RefNo) 
  {
	TataVivanta_RefNo = tataVivanta_RefNo;
  }

   public static void BookHotel()
   {
      BookHotel ref = new BookHotel();
        Scanner s = new Scanner(System.in);
        System.out.println("From Date in formate of dd-mm-yr:");
        System.out.println("To Date in formate of dd-mm-yr:");
        System.out.println("Rooms:");
        System.out.println("Adults:");
        System.out.println("Childrens:");
        System.out.println("Name:");
        System.out.println("Email:");
        System.out.println("PhoneNo:");

        String d = s.next();
        String d1 = s.next();
        int d2 = s.nextInt();
        int d3 = s.nextInt();
        int d4 = s.nextInt();
        String n = s.next();
        String e= s.next();
        int p = s.nextInt();
        Random r= new Random();
        int g = r.nextInt(1000000000);
        

        ref.setTataVivanta_FromDate(d);
        ref.setTataVivanta_ToDate(d1);
        ref.setTataVivanta_Rooms(d2);
        ref.setTataVivanta_Adults(d3);
        ref.setTataVivanta_Children(d4);
        ref.setTataVivanta_Name(n);
        ref.setTataVivanta_Email(e);
        ref.setTataVivanta_PhoneNo(p);
        ref.setTataVivanta_RefNo(g);

        System.out.println("From Date:"+ref.getTataVivanta_FromDate());
        System.out.println("To Date:"+ref.getTataVivanta_ToDate());
        System.out.println("Rooms:"+ref.getTataVivanta_Rooms());
        System.out.println("Adults:"+ref.getTataVivanta_Adults());
        System.out.println("Children:"+ref.getTataVivanta_Children());
        System.out.println("RefNo:"+ref.getTataVivanta_RefNo());
        System.out.println("Name:"+ref.getTataVivanta_Name());
        System.out.println("Email:"+ref.getTataVivanta_Email());
        System.out.println("PhoneNo:"+ref.getTataVivanta_PhoneNo());

         System.out.println(" Your Booking For TataVivanta successful :)");
      }

   }
 
 class CancelHotel extends TataVivanta
 {
   public static void CancelHotel()
   {
      System.out.println("Welcome To Cancellation");
      Scanner s2 = new Scanner(System.in);
       System.out.println("Enter RefNo:");
       int model1 = s2.nextInt();
       System.out.println("RefNo:"+model1);
       CancelHotel1();
   }
    public static void CancelHotel1()
    {
      System.out.println("Choose Preferred Option : 1)Placed By mistake 2) Date Issue 3) Others");
      Scanner s3 = new Scanner(System.in);
      int colour =s3.nextInt();
      switch(colour)
      {
              case 1: System.out.println("You Choose: Placed By Mistake");
              break;
              case 2: System.out.println("You Choose: Date Issue ");
              break;
              case 3:System.out.println("You Choose: Others");
              break;
              default:System.out.println("Invalid Choice");
      }
         System.out.println("Thank you for your time your. Your cancellation successful ");
    }
 }
class TataFinancial extends TATA
{
    public static void TataFinancial()
    {
   System.out.println("welcome to TataFinancial");
    Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataCapital 2) TataAia");
     int choice = s.nextInt();
     switch(choice)
     {
      case 1: TataCapital f = new TataCapital();
      f.TataCapital();
      break;
      case 2:  TataAia f1=new TataAia();
      f1.TataAia();
      break;
      default:System.out.println("Invalid Choice");
     }
    }
}
class TataCapital extends TataFinancial
{
  private String Name;
	private int PhoneNo;
	private String Email;
	private String Address;
	private String State;
	private String District;
	private String City;
	private int Pincode;
	private int AdharNo;
	private String PancardNo;
	private String BankName;
	private String BankBranch;
	private int BankAccNo;
	private String BankIfscCode;
	
	
	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public int getPhoneNo()
	{
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo)
	{
		PhoneNo = phoneNo;
	}

	public String getEmail()
	{
		return Email;
	}

	public void setEmail(String email)
	{
		Email = email;
	}

	public String getAddress()
	{
		return Address;
	}

	public void setAddress(String address)
	
	{
		Address = address;
	}

	public String getState()
	{
		return State;
	}

	public void setState(String state)
	{
		State = state;
	}

	public String getDistrict()
	{
		return District;
	}

	public void setDistrict(String district)
	{
		District = district;
	}

	public String getCity()
	{
		return City;
	}

	public void setCity(String city) 
	{
		City = city;
	}

	public int getPincode()
	{
		return Pincode;
	}

	public void setPincode(int pincode)
	{
		Pincode = pincode;
	}

	public int getAdharNo()
	{
		return AdharNo;
	}

	public void setAdharNo(int adharNo)
    {
		AdharNo = adharNo;
	}

	public String getPancardNo()
	{
		return PancardNo;
	}

	public void setPancardNo(String pancardNo)
	{
		PancardNo = pancardNo;
	}

	public String getBankName() 
	{
		return BankName;
	}

	public void setBankName(String bankName)
	{
		BankName = bankName;
	}

	public String getBankBranch() 
	{
		return BankBranch;
	}

	public void setBankBranch(String bankBranch)
	{
		BankBranch = bankBranch;
	}

	public int getBankAccNo() 
	{
		return BankAccNo;
	}

	public void setBankAccNo(int bankAccNo) 
	{
		BankAccNo = bankAccNo;
	}

	public String getBankIfscCode()
	{
		return BankIfscCode;
	}

	public void setBankIfscCode(String bankIfscCode)
	{
		BankIfscCode = bankIfscCode;
	}

	@Override
	public String toString()
	{
		return "TataCapital [Name=" + Name + ", PhoneNo=" + PhoneNo + ", Email=" + Email + ", Address=" + Address
				+ ", State=" + State + ", District=" + District + ", City=" + City + ", Pincode=" + Pincode
				+ ", AdharNo=" + AdharNo + ", PancardNo=" + PancardNo + ", BankName=" + BankName + ", BankBranch="
				+ BankBranch + ", BankAccNo=" + BankAccNo + ", BankIfscCode=" + BankIfscCode + "]";
	}
	
	 TataCapital(String name, int phoneNo, String email, String address, String state, String district,
			String city, int pincode, int adharNo, String pancardNo, String bankName, String bankBranch, int bankAccNo,
			String bankIfscCode) 
      {
		super();
		Name = name;
		PhoneNo = phoneNo;
		Email = email;
		Address = address;
		State = state;
		District = district;
		City = city;
		Pincode = pincode;
		AdharNo = adharNo;
		PancardNo = pancardNo;
		BankName = bankName;
		BankBranch = bankBranch;
		BankAccNo = bankAccNo;
		BankIfscCode = bankIfscCode;
	    }

      TataCapital()
      {

      }
         
    public static void TataCapital()
   {
    System.out.println("WELCOME TO TATACAPITAL");
     System.out.println("Please fill the below details");
     
     System.out.println("Enter Name");	
	    System.out.println("Enter PhoneNo");	
	    System.out.println("Enter Email");	
	    System.out.println("Enter Address");	
	    System.out.println("Enter State");	
	    System.out.println("Enter District");	
	    System.out.println("Enter City");	
	    System.out.println("Enter Pincode");	
	    System.out.println("Enter AdharNo");	
	    System.out.println("Enter PancardNo");	
	    System.out.println("Enter BankNAme");	
	    System.out.println("Enter BankBranch");	
	    System.out.println("Enter BankAccNo");	
	    System.out.println("Enter BankIfscCode");	
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s1 = sc.next();
	    int s2 = sc.nextInt();
	    String s3 = sc.next();
	    String s4 = sc.next();
	    String s5 = sc.next();
	    String s6 = sc.next();
	    String s7 = sc.next();
	    int s8 = sc.nextInt();
	    int s9= sc.nextInt();
	    String s10 = sc.next();
	    String s11 = sc.next();
	    String s12 = sc.next();
	    int s13 = sc.nextInt();
	    String s14 = sc.next();
		
	    TataCapital t = new TataCapital(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14);
	    
	    t.setName(s1);
	    t.setPhoneNo(s2);
	    t.setEmail(s3);
	    t.setAddress(s4);
	    t.setState(s5);
	    t.setDistrict(s6);
	    t.setCity(s7);
	    t.setPincode(s8);
	    t.setAdharNo(s9);
	    t.setPancardNo(s10);
	    t.setBankName(s11);
	    t.setBankBranch(s12);
	    t.setBankAccNo(s13);
	    t.setBankIfscCode(s14);
	    
	    System.out.println(t);
      System.out.println(" Thank you for your details. We will let you know further instructions....");   
   }
   
}

class TataAia extends TataFinancial
{
      private String Name;
		private int PhoneNo;
		private String Email;
		private String Address;
		private String State;
		private String District;
		private String City;
		private int Pincode;
		private int AdharNo;
		private String PancardNo;
		
		
		public String getName()
		{
			return Name;
		}

		public void setName(String name)
		{
			Name = name;
		}

		public int getPhoneNo()
		{
			return PhoneNo;
		}

		public void setPhoneNo(int phoneNo)
		{
			PhoneNo = phoneNo;
		}

		public String getEmail()
		{
			return Email;
		}

		public void setEmail(String email)
		{
			Email = email;
		}

		public String getAddress()
		{
			return Address;
		}

		public void setAddress(String address)
		
		{
			Address = address;
		}

		public String getState()
		{
			return State;
		}

		public void setState(String state)
		{
			State = state;
		}

		public String getDistrict()
		{
			return District;
		}

		public void setDistrict(String district)
		{
			District = district;
		}

		public String getCity()
		{
			return City;
		}

		public void setCity(String city) 
		{
			City = city;
		}

		public int getPincode()
		{
			return Pincode;
		}

		public void setPincode(int pincode)
		{
			Pincode = pincode;
		}

		public int getAdharNo()
		{
			return AdharNo;
		}

		public void setAdharNo(int adharNo)
	    {
			AdharNo = adharNo;
		}

		public String getPancardNo()
		{
			return PancardNo;
		}

		public void setPancardNo(String pancardNo)
		{
			PancardNo = pancardNo;
		}
		
		
		TataAia()
		{
			
		}
		
		TataAia(String Name)
		{
			this();
			this.Name=Name;	
		}
		
		TataAia(String Name,int PhoneNo)
		{
			this(Name);
			this.PhoneNo=PhoneNo;
		}
		
		TataAia(String Name,int PhoneNo,String Email)
		{
			this(Name,PhoneNo);
			this.Email=Email;
		}
		
		TataAia(String Name,int PhoneNo,String Email,String Address)
		{
			this(Name,PhoneNo,Email);
			this.Address=Address;
		}
		
	    TataAia(String Name,int PhoneNo,String Email,String Address,String State)
	    {
	    	this(Name,PhoneNo,Email,Address);
	    	this.State=State;
	    }
	    
	    TataAia(String Name,int PhoneNo,String Email,String Address,String State,String District)
	    {
	    	this(Name,PhoneNo,Email,Address,State);
	    	this.District=District;
	    }
	    
	    TataAia(String Name,int PhoneNo,String Email,String Address,String State,String District,String City)
	    {
	    	this(Name,PhoneNo,Email,Address,State,District);
	    	this.City=City;
	    }
	    
	    TataAia(String Name,int PhoneNo,String Email,String Address,String State,String District,String City,int Pincode)
	    {
	    	this(Name,PhoneNo,Email,Address,State,District,City);
	    	this.Pincode=Pincode;
	    }
	    
	    TataAia(String Name,int PhoneNo,String Email,String Address,String State,String District,String City,int Pincode,int AdharNo)
	    {
	    	this(Name,PhoneNo,Email,Address,State,District,City,Pincode);
	    	this.AdharNo=AdharNo;
	    }
	    
	    TataAia(String Name,int PhoneNo,String Email,String Address,String State,String District,String City,int Pincode,int AdharNo,String PancardNo)
	    {
	    	this(Name,PhoneNo,Email,Address,State,District,City,Pincode,AdharNo);
	    	this.PancardNo=PancardNo;
	    }
	    

public static void TataAia()
   {
    System.out.println("WELCOME TO TATAAIA");
    System.out.println("Please fill the below details");
    
    System.out.println("Enter Name");	
    System.out.println("Enter PhoneNo");	
    System.out.println("Enter Email");	
    System.out.println("Enter Address");	
    System.out.println("Enter State");	
    System.out.println("Enter District");	
    System.out.println("Enter City");	
    System.out.println("Enter Pincode");	
    System.out.println("Enter AdharNo");	
    System.out.println("Enter PancardNo");
    
    
    Scanner s =new Scanner(System.in);
    
    String s1 = s.next();
    int s2 = s.nextInt();
    String s3 = s.next();
    String s4 = s.next();
    String s5 = s.next();
    String s6 = s.next();
    String s7 = s.next();
    int s8 = s.nextInt();
    int s9= s.nextInt();
    String s10 = s.next();
    
    TataAia t = new TataAia(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
    
    
    t.setName(s1);
    t.setPhoneNo(s2);
    t.setEmail(s3);
    t.setAddress(s4);
    t.setState(s5);
    t.setDistrict(s6);
    t.setCity(s7);
    t.setPincode(s8);
    t.setAdharNo(s9);
    t.setPancardNo(s10);
    
   
    
    System.out.println(" Name:"+t.getName());	
    System.out.println(" PhoneNo:"+t.getPhoneNo());	
    System.out.println(" Email:"+t.getEmail());	
    System.out.println(" Address:"+t.getAddress());	
    System.out.println(" State:"+t.getState());	
    System.out.println(" District:"+t.getDistrict());	
    System.out.println(" City:"+t.getCity());	
    System.out.println(" Pincode:"+t.getPincode());	
    System.out.println(" AdharNo:"+t.getAdharNo());	
    System.out.println(" PancardNo:"+t.getPancardNo());

     System.out.println(" Thank you for your details. We will let you know further instructions....");  
    
   } 
}
class TataMetal extends TATA
{
  public static void TataMetal()
  {  
   System.out.println("welcome to TataMetal");
   Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataSteel 2) TataMetaliks");
     int choice = s.nextInt(); 
     switch(choice)
     {
      case 1:TataSteel m = new TataSteel();
      m.TataSteel();
      break;
      case 2: TataMetaliks m1 = new TataMetaliks();
      m1.TataMetaliks();
      break;
      default:System.out.println("Invalid Choice");
     }
}
}
class TataSteel extends TataMetal
{
    public static void TataSteel()
   {
    System.out.println("WELCOME TO TATASTEEL");
   }
}
class TataMetaliks extends TataMetal
{
   public static void TataMetaliks()
   {
    System.out.println("WELCOME TO TATAMETALIKS");
   }
}
class TataIt extends TATA
{
    public static void TataIt()
    {
   System.out.println("welcome to TataIt");
   Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataElxsi 2) TataTcs"); 
     int choice = s.nextInt(); 
     switch(choice)
     {
      case 1: TataElxsi i = new TataElxsi();
      i.TataElxsi();
      break;
      case 2:TataTcs i1 = new  TataTcs();
      i1.TataTcs();
      break;
      default:System.out.println("Invalid Choice");
     }
    }
} 
   class TataElxsi extends TataIt
{
    public static void TataElxsi()
   {
    System.out.println("WELCOME TO TATAELXSI");
   }
}
class  TataTcs extends TataIt
{
   public static void TataTcs()
   {
    System.out.println("WELCOME TO TATATCS");
   }
}
class TataInfra extends TATA
{
  public static void TataInfra()
  {
   System.out.println("welcome to TataInfra");
   Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataPower 2) TataHousing");
     int choice = s.nextInt();
     switch(choice)
     {
      case 1:TataPower ref = new  TataPower();
      ref.TataPower();
      break;
      case 2: TataHousing ref1 = new TataHousing();
      ref1.TataHousing();
      break;
      default:System.out.println("Invalid Choice");
     }
   }
}
class TataPower extends TataInfra
{
    public static void TataPower()
   {
    System.out.println("WELCOME TO TATAPOWER");
   }
}
class TataHousing extends TataInfra
{
   public static void TataHousing()
   {
    System.out.println("WELCOME TO TATAHOUSING");
   }
}
class TataConsumer extends TATA
{
  public static void TataConsumer()
  {
   System.out.println("welcome to TataConsumer");
   Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataVoltas 2) TataTea");
     int choice = s.nextInt();
     switch(choice)
     {
      case 1:TataVoltas c = new  TataVoltas();
      c.TataVoltas();
      break;
      case 2:TataTea c1 = new TataTea();
      c1.TataTea();
      break;
      default:System.out.println("Invalid Choice");
     }
   }
}
   class TataVoltas extends TataConsumer
   {
    public static void TataVoltas()
   {
    System.out.println("WELCOME TO TATAVOLTAS");
   }
   }
   class TataTea extends TataConsumer
   {
   public static void TataTea()
   {
    System.out.println("WELCOME TO TATATEA");
   }
   }
class TataTelecom extends TATA
{
  public static void TataTelecom()
  {
   System.out.println("welcome to TataTelecom");
   Scanner s = new Scanner(System.in);
   System.out.println("Select choice: 1) TataSky 2) TataTele");
     int choice = s.nextInt();
     switch(choice)
     {
      case 1:TataSky t = new  TataSky();
      t.TataSky();
      break;
      case 2:TataTele t1 = new  TataTele();
      t1.TataTele();
      break;
      default:System.out.println("Invalid Choice");
     }
   }
  }
  class TataSky extends TataTelecom
  {
    public static void TataSky()
   {
    System.out.println("WELCOME TO TATASKY");
   }
  }
  class TataTele extends TataTelecom
  {
   public static void TataTele()
   {
    System.out.println("WELCOME TO TATATELE");
   }
}
class Driver1
{
    public static void main(String[]args)
    { 
        System.out.println("WELCOME TO TATA EMPIRE");
         Scanner s = new Scanner(System.in);
         System.out.println("Enter Your Choice: 1) TataRetail 2) TataAuto 3) TataTravel 4) TataFinancial 5) TataMetal 6) TataIt 7) TataInfra 8) TataConsumer 9) TataTelecom");
         int choice = s.nextInt();
         switch(choice)
         {
            case 1:TataRetail ref = new TataRetail();
            ref.TataRetail();
            break; 
            case 2:TataAuto ref2 = new TataAuto();
            ref2.TataAuto();
            break;
            case 3:TataTravel ref3 = new TataTravel();
            ref3.TataTravel();
            break;
            case 4: TataFinancial ref4 = new TataFinancial();
            ref4.TataFinancial();
            break;
            case 5:TataMetal ref5 = new TataMetal();
            ref5.TataMetal();
            break;
            case 6:TataIt ref6 = new TataIt();
            ref6.TataIt();
            break;
            case 7:TataInfra ref7 = new TataInfra();
            ref7.TataInfra();
            break;
            case 8:TataConsumer ref8 = new TataConsumer();
            ref8.TataConsumer();
            break;
            case 9:TataTelecom ref9 = new TataTelecom();
            ref9.TataTelecom();
            break;
            default:System.out.println("Invalid Input");
         }      
    }
}