package practice;
import java.util.Scanner;

public class Personnel {
	public static Scanner scanner= new Scanner(System.in);
	public static Pilot [] personnel = new Pilot [100];

	public static void printPersonnel(){
		System.out.println("1. List all pilots");
		System.out.println("2. Hire pilot");
		int userChoice= scanner.nextInt();
		
		switch (userChoice) {
		
		case (1):
			for (int i=0; i< personnel.length; i++)
			{
				if (personnel[i] !=null)
					System. out.println(personnel[i]);
			}
		printPersonnel();
		break;
		case (2): Pilot.addPilot();
		printPersonnel();
		break;
		}
		
	}
}
