import java.util.*;
/*
 *  Author Lambros Lambri
 *  Date: 15th December 2016 
 *  Class CSC1021
 *  Room Class that stores an array of beds.
 */

public class Room {

	private ArrayList<Bed> bedsList;

	// This is the Constructor for the Room Class.
	public Room() {
		bedsList = new ArrayList<Bed>();
	}

	// This is a get method that gets a List of the Rooms.
	public ArrayList<Bed> getBedsList() {
		return bedsList;
	}

	// This is a set method that sets a List of the Rooms.
	public void setBedsList(ArrayList<Bed> bedsList) {
		this.bedsList = bedsList;
	}

	// This adds beds in the Bed List.
	public void addBed(Bed bed) {
		bedsList.add(bed);
	}

	// This is a method that get all the Number of Beds.
	public int getNumberOfBeds() {
		return bedsList.size();
	}

	// This is a method that calculates the Room Occupancy.
	public int RoomOccupancy() {

		int roccupancy;
		roccupancy = 0;

		for (Bed bed : bedsList) {
			roccupancy = roccupancy + bed.BedOccupancy();
		}

		return roccupancy;
	}
}
