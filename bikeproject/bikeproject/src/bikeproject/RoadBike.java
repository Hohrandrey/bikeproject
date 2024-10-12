package bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor

	public void setTyreWidth(String newValue) {
		try {
			this.tyreWidth = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			System.out.println("Invalid tyre width value. Please enter a number.");
		}
	}

	public String getTyreWidth() {
		return String.valueOf(this.tyreWidth);
	}

	public void setPostHeight(String newValue) {
		try {
			this.postHeight = Integer.parseInt(newValue);
		} catch (NumberFormatException e) {
			System.out.println("Invalid post height value. Please enter a number.");
		}
	}

	public String getPostHeight() {
		return String.valueOf(this.postHeight);
	}

	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription
}//end class RoadBike
