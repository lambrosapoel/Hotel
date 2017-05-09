/*
 *  Author Lambros Lambri
 *  Date: 15th December 2016 
 *  Class CSC1021
 *  Stores the Bed sizes and the Bed occupancy.
 */

public class Bed {

	private String sizeBed;

	// This is the Constructor for the Bed Class.
	public Bed(String sizeBed) {
		this.sizeBed = sizeBed;
	}

	// This is a method that gets the Size of the Bed.
	public String getSizeBed() {
		return sizeBed;
	}

	// This is a method that sets the Size of the Bed.
	public void setSizeBed(String sizeBed) {
		this.sizeBed = sizeBed;
	}

	// This is a method that returns 1 or 2 depending on Bed Size.
	public int BedOccupancy() {
		if (sizeBed == "Single")
			return 1;
		else if (sizeBed == "Double")
			return 2;
		else
			return 0;
	}
}