package bikeproject;


public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int numGears;
	private final String make;

	public Bike() {
		this.make = "Oracle Cycles";
	} //end constructor

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		this.numGears = numGears;
		this.make = "Oracle Cycles";
	} //end constructor

	protected void printDescription() {
		System.out.println("\n" + this.make + "\n"
				+ "This bike has " + this.handleBars + " handlebars on a "
				+ this.frame + " frame with " + this.numGears + " gears."
				+ "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	} //end method printDescription

	public void displayManufacturer() {
		System.out.println("Manufacturer: " + MANUFACTURER);
	}

	public void displayParts() {
		System.out.println("Bike Parts: ");
		System.out.println("Handlebars: " + handleBars);
		System.out.println("Frame: " + frame);
		System.out.println("Tyres: " + tyres);
		System.out.println("Seat Type: " + seatType);
		System.out.println("Number of Gears: " + numGears);
	}
}
	
	

