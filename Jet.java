package practice;

import java.util.Scanner;

//fields
public class Jet {
	
 public static Scanner scanner = new Scanner(System.in);
	  	  
	private String fleet;
    private int fastestJet;
    private int longestRange;
    private int passengerCapacity;
    private double price;
    private Pilot pilot;
    
    //getters and setters
	public String getFleet() {
		return fleet;
	}
	public void setFleet(String fleet) {
		this.fleet = fleet;
	}
	public int getFastestJet() {
		return fastestJet;
	}
	public void setFastestJet(int fastestJet) {
		this.fastestJet = fastestJet;
	}
	public int getLongestRange() {
		return longestRange;
	}
	public void setLongestRange(int longestRange) {
		this.longestRange = longestRange;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
	//constructors
	public Jet(String fleet, int fastestJet, int longestRange, int passengerCapacity, double price, Pilot pilot) {
		super();
		this.fleet = fleet;
		this.fastestJet = fastestJet;
		this.longestRange = longestRange;
		this.passengerCapacity = passengerCapacity;
		this.price = price;
		this.pilot = pilot;
	}
	
	///generate toString
	@Override
	public String toString() {
		return this.fleet + ": " + "\nMax Speed: " + this.fastestJet + "\nRange: " + this.longestRange
		+ "\nPilot: " + this.pilot + "\n";
				
	}
	public static void addJet() {
		System.out.println("What is the name of your jet?");
		String name = scanner.next();
		System.out.println("How fast does it go?");
		int speed= scanner.nextInt();
		System.out.println("What range does it go?");
		int range= scanner.nextInt();
		System.out.println("What is the passenger capacity?");
		int capacity= scanner.nextInt();
		System.out.println("How much does the jet cost?");
		double price= scanner.nextDouble();
		Pilot pilot= null;
		
		Jet newJet= new Jet (name, speed, range, capacity, price, null);
		for (int i=0; i < Fleet.fleet.length; i++) {
			if (Fleet.fleet[i] == null) {
				Fleet.fleet[i] = newJet;
				break;
			}
		}

	}
}
