package practice;
import java.util.Scanner;
//fields (these are the parameters for the pilot)
public class Pilot {
	public static Scanner scanner= new Scanner(System.in);
	private boolean inAirforce;
	private  int experience;
	private String name;
	
	
	// generate getters and setters	
	public boolean isInAirforce() {
		return inAirforce;
	}
	public void setInAirforce(boolean inAirforce) {
		this.inAirforce = inAirforce;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


/// generate constructors
	public Pilot(boolean inAirforce, int experience, String name) {
		super();
		this.inAirforce = inAirforce;
		this.experience = experience;
		this.name = name;
	}
	
	/// generate toString
	@Override
	public String toString() {
		return name  + ", an Air Force Veteran with " + experience + " years of experience.";
	}
	
	public static void addPilot() {
		
		
		System.out.println("What is your name?");
		String name= scanner.next();
		
		System.out.println("Air force experience? yes or no");
		String experience= scanner.next();
			if (experience.equals("yes")) {
		
		System.out.println("How many years of experience?");
		int years= scanner.nextInt();
			if (years>3) {
				
			Pilot newPilot= new Pilot (true,years,name) ;
			for (int i=0; i< Personnel.personnel.length; i++) {
			if (Personnel.personnel[i]== null) {
				Personnel.personnel[i] = newPilot;
				break;
			}
		}
	}
	 }
   }	
}
	
