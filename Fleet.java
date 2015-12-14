package practice;
import java.util.Scanner;

public class Fleet {
	public static Scanner scanner= new Scanner(System.in);
	public static Jet [] fleet = new Jet [100];
	
	public static void printFleet() {
		System.out.println("1. List all jets");
		System.out.println("2. List fastest jet");
		System.out.println("3. List jet with furthest range");
		System.out.println("4. Add a jet");
		System.out.println("5. Return to menu");
		System.out.println(" ");
		System.out.println(" Please select an option!");
		int userChoice= scanner.nextInt();
	
	
		switch (userChoice) {
		
		case (1): 	 
			for (int i=0; i < fleet.length; i++)
			{
				if (fleet[i] !=null)
					System.out.println(fleet[i]);
			}
		printFleet();
		break;
		case (2):
		System.out.println( "Boeing 767-300 ER");
        System.out.println("Speed: 414 mph");
        System.out.println("Range: 11,093 km");
        System.out.println("Passenger capacity: 30 business class, 191 economy class");
        System.out.println("Price: $191 million");
        printFleet();
		break;
		case (3):
        System.out.println( "Boeing 767-300 ER");
        System.out.println("Speed: 414 mph");
        System.out.println("Range: 11,093 km");
        System.out.println("Passenger capacity: 30 business class, 191 economy class");
        System.out.println("Price: $191 million");
        printFleet();
        break;
		case (4): Jet.addJet();
		printFleet();
		break;
	
		case (5): 
		FleetMenu.printMenu();
		break;
	
	}
	
	}
}
