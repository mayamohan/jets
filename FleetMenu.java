package practice;
import java.util.*;

public class FleetMenu {

	public static Scanner scanner= new Scanner(System.in);
	public static boolean keepGoing= true;
	
	 public static void printMenu() {
		 
			System.out.println("Option 1: Fleet");
	        System.out.println("Option 2: Personnel");
	        System.out.println("Option 3: Quit ");
	        System.out.println(" ");
	        System.out.println("Please select an option");	 
	        int userChoice= scanner.nextInt(); 
		 
	        switch (userChoice) {
			
	        case (1): Fleet.printFleet();
			case (2): Personnel.printPersonnel();
			case (3): System.exit(0);
	        }  
	 }
	
	
	public static void main (String [] args) {	
		
		///List pilots
		Pilot Jamie= new Pilot (true, 4, "Jamie Romero");	
		Pilot Cole= new Pilot (true, 5, "Cole Frock");
		Pilot Michael= new Pilot(true, 7, "Michael Jackson");
		
		//List jets
		
		Jet Boeing737 = new Jet("Boeing 737", 391, 5765, 156, 93.3, Jamie);
		Jet ATR72 = new Jet("ATR 72-600", 288, 1528, 68, 19.0, Cole);
		Jet Boeing767 = new Jet ("Boeing 767-300ER",414,11093, 221, 191.0, Michael);
		
		//Array of jets to put into our fleet
		
		Fleet.fleet[0]= Boeing737;
		Fleet.fleet[1]= ATR72;
		Fleet.fleet[2]= Boeing767;
		
		//Array of pilots to put into our jets
		
		Personnel.personnel[0]= Jamie;
		Personnel.personnel[1]= Cole;
		Personnel.personnel[2]=Michael;
		
		
		/////START TYPING OUT PROGRAM HERE
		
			printMenu();
		   
		
	}
}
