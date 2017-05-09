import java.util.*;
/*
 *  Author Lambros Lambri
 *  Date: 15th December 2016 
 *  Class CSC1021
 *  Stores the Name of the hotel and an array of rooms.
 */

public class Hotel {

	private String name;
	private ArrayList<Room> roomsList;
	private boolean hasVacancies;

	// This is the Constructor for the Hotel Class.
	public Hotel() {
		roomsList = new ArrayList<Room>();
	}

	// This is a get method that gets the name of the hotel.
	public String getName() {
		return name;
	}

	// This is a set method that sets the name of the hotel.
	public void setName(String name) {
		this.name = name;
	}

	// This is a get method that gets a List of the Rooms.
	public ArrayList<Room> getRoomsList() {
		return roomsList;
	}

	// This is a set method that sets a List of the Rooms.
	public void setRoomsList(ArrayList<Room> roomsList) {
		this.roomsList = roomsList;
	}

	// This is a method that adds Rooms in the List.
	public void addRoom(Room room) {
		roomsList.add(room);
	}

	// This is a method that gets all the Number of Rooms.
	public int getNumberOfRooms() {
		return roomsList.size();
	}

	// This is a method that calculates the Max Occupancy.
	public int maxOccupancy() {

		int moccupancy;
		moccupancy = 0;

		for (Room room : roomsList) {
			moccupancy = moccupancy + room.RoomOccupancy();
		}

		return moccupancy;
	}

	// This is a method that returns true or false depending on the value.
	public boolean isHasVacancies() {
		return hasVacancies;
	}

	// This is a method that sets if the vacancies are true or false.
	public void setHasVacancies(boolean hasVacancies) {
		this.hasVacancies = hasVacancies;
	}
}
