package PracticeTasksOnCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BookSlotsAtBalajiSportsComplex {
	
		static String name;
		static String S;
		Scanner sc=new  Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("WELCOME TO BALAJI SPORTS COMPLEX,HYDERABAD" );
            badmintonslots.put(1,  "09:00AM to 10:00AM");
			badmintonslots.put(2,  "10:00AM to 11:00AM");
			badmintonslots.put(3,  "11:00AM to 12:00AM");
			badmintonslots.put(4,  "12:00AM to 01:00PM");
			badmintonslots.put(5,  "01:00PM to 02:00PM");
			badmintonslots.put(6,  "02:00PM to 03:00PM");
			badmintonslots.put(7,  "03:00PM to 04:00PM");
			badmintonslots.put(8,  "04:00PM to 05:00PM");
			badmintonslots.put(9,  "05:00PM to 06:00PM");
			badmintonslots.put(10, "06:00PM to 07:00PM");

			footballslots.put(1,  "09:00AM to 09:30AM");
			footballslots.put(2,  "09:30AM to 10:00AM");
			footballslots.put(3,  "10:00AM to 10:30AM");
			footballslots.put(4,  "10:30AM to 11:00AM");
			footballslots.put(5,  "11:00AM to 11:30AM");
			footballslots.put(6,  "11:30AM to 12:00PM");
			footballslots.put(7,  "12:00PM to 12:30PM");
			footballslots.put(8,  "12:30PM to 01:00PM");
			footballslots.put(9,  "01:00PM to 01:30PM");
			footballslots.put(10, "01:30PM to 02:00PM");
			footballslots.put(11, "02:00PM to 02:30PM");
			footballslots.put(12, "02:30PM to 03:00PM");
			footballslots.put(13, "03:00PM to 03:30PM");
			footballslots.put(14, "03:30PM to 04:00PM");
			footballslots.put(15, "04:00PM to 04:30PM");
			footballslots.put(16, "04:30PM to 05:00PM");
			footballslots.put(17, "05:00PM to 05:30PM");
			footballslots.put(18, "05:30PM to 06:00PM");
			footballslots.put(19, "06:00PM to 06:30PM");
			footballslots.put(20, "06:30PM to 07:00PM");

			boxcricketslots.put(1, "10:00AM to 12:00PM");
			boxcricketslots.put(2, "12:00PM to 02:00PM");
			boxcricketslots.put(3, "02:00PM to 04:00pM");
			boxcricketslots.put(4, "04:00PM to 06:00PM");
			boxcricketslots.put(5, "06:00PM to 08:00PM");

			BookSlotsAtBalajiSportsComplex obj=new BookSlotsAtBalajiSportsComplex();
			obj.listOfSports();
}

		public void listOfSports() {

			System.out.println("Please enter your name");
			sc.nextLine();
			name=sc.nextLine();
		    System.out.println("Sports list");
			Map<Integer,String>sportslist=new HashMap<>();
			sportslist.put(1,"Badminton court");
			sportslist.put(2, "Football");
			sportslist.put(3, "Box cricket");
			System.out.println("Serial No"+"     "+"Name of the Sport");
			System.out.println("   ");
			for (Map.Entry<Integer, String> list : sportslist.entrySet()) {
				System.out.println("   "+list.getKey()+"            "+list.getValue());
			}
			System.out.println("Select the Serial number you wanted to book");
		
			int choice=sc.nextInt();
			
			if(choice==1) {
				Badminton();
				}
			else if(choice==2) {
				Football();
			}
			else if(choice==3) {
				Boxcricket();
			}
			else {
				System.out.println("choose correct slotno which are given in the choices omly");
		eee();
			}
			}
		public void eee() {
			listOfSports();
			
		}
static Map<Integer,String>badmintonslots=new HashMap<>();
	public void Badminton() {
			System.out.println("To book the slot for Badminton-> Enter your Name again");
			sc.nextLine();
			String user=sc.nextLine();
			System.out.println(" ");
			System.out.println("choose the available slots for Badminton");
			System.out.println(" ");
			System.out.println("SerialNo"+"     "+"SlotTimings");
			System.out.println("   ");
			for (Map.Entry<Integer, String> list : badmintonslots.entrySet()) {
				System.out.println("   "+list.getKey()+"            "+list.getValue());
			}
			System.out.println("Select the slot you want to book");
			int badmintonchoice=sc.nextInt();

			if (badmintonslots.get(badmintonchoice)!=null) {

			System.out.println("your booking is Successful...");
			System.out.println("your slot details  "+"name="+user+"  "+"Slot Timing"+" "+badmintonslots.get(badmintonchoice)+" "+"Sport name=Badminton ");
			System.out.println("Have Fun at Balaji Sports Complex");
			System.out.println("Thank you for booking..");
			
			}
			else
			{
				System.out.println("your required slot is already booked so choose another badminton slot");
				System.out.println("OR");
				System.out.println("CHOOSE ONLY THE DISPLAYED SLOT NUMBERS");
				
				
			}
			badmintonslots.remove(badmintonchoice);
			System.out.println("if you want to choose another slot press y . if you want to exit press N");
			S=sc.next();
			if (S.equalsIgnoreCase("y")) {
				Badminton();
			}
			else {
				listOfSports();
			}

			}

		static Map<Integer,String>footballslots=new HashMap<>();

		public void Football() {

			System.out.println("To book the slot for Foot ball-> Enter your Name again");
			sc.nextLine();
			String user=sc.nextLine();
			System.out.println(" ");
			System.out.println("choose the available slots for foodball");
			System.out.println(" ");
			System.out.println("SerialNumber"+"        "+"SlotTimings");
			System.out.println("   ");
			for (Map.Entry<Integer, String> list : footballslots.entrySet()) {
				System.out.println("   "+list.getKey()+"            "+list.getValue());
			}
			System.out.println("Please choose your Slot serial number you wish to book");
			int footballchoice=sc.nextInt();

			if (footballslots.get(footballchoice)!=null) {

			System.out.println("your booking is Successful");
			System.out.println("your slot details  "+"name="+user+"  "+"Slot Timings"+" "+footballslots.get(footballchoice)+" "+"Sport name=FootBall ");
			System.out.println("Have Fun at Balaji Sports Complex");
			System.out.println("thanks for booking");
			}
			else
			{
				System.out.println("your required slot is already booked so choose another Football slot");
				System.out.println("OR");
				System.out.println("CHOOSE ONLY THE DISPLAYED SLOT NUMBERS");
			}
			footballslots.remove(footballchoice);
			System.out.println("if you want to choose another slot press y . if you want to exit press N");
			S=sc.next();
			if (S.equalsIgnoreCase("y")) {
				Football();
			}
			else {
				listOfSports();
			}	
		}

		static Map<Integer,String>boxcricketslots=new HashMap<>();

		public void Boxcricket() {
			System.out.println("To book the slot for Foot ball-> Enter your Name");
			sc.nextLine();
			String user=sc.nextLine();
			
			System.out.println("choose the available slots for Box Cricket");
			System.out.println(" ");
			System.out.println("SerialNo"+"       "+"SlotTimings");
			System.out.println("   ");
			for (Map.Entry<Integer, String> list : boxcricketslots.entrySet()) {
				System.out.println("   "+list.getKey()+"            "+list.getValue());
			}
			System.out.println("Please choose your Slot serial number you wish to book");
			int boxcricketchoice=sc.nextInt();

			if (boxcricketslots.get(boxcricketchoice)!=null) {

			System.out.println("your booking Succesful...");
			System.out.println("your slot details  "+"name="+user+"  "+"Slot Timings"+" "+boxcricketslots.get(boxcricketchoice)+" "+"Sport name=Box Cricket ");
			System.out.println("Have Fun at Balaji Sports Complex");
			System.out.println("thanks for booking");
			}
			else
			{
				System.out.println("your required slot is already booked so choose another Box Cricket slot");
				System.out.println("OR");
				System.out.println("CHOOSE ONLY THE DISPLAYED SLOT NUMBERS");
			}
			boxcricketslots.remove(boxcricketchoice);
			System.out.println("if you want to choose another slot press y . if you want to exit press N");
			S=sc.next();
			if (S.equalsIgnoreCase("y")) {
				Boxcricket();
			}
			else {
				listOfSports();
			}
		}


	

}
