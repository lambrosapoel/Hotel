/*
 *  Author Lambros Lambri
 *  Date: 15th December 2016 
 *  Class CSC1021
 *  This class prints a report to the user after he finishes his input or runs the test.
 */

public class HotelReport {

	public HotelReport(Hotel hotel) {
		printHotelReport(hotel);
	}

	// This method takes as parameter the hotel object and prints a report for
	// the number of rooms, number of beds for each room, size for each bed, if
	// the hotel has vacancy and the max occupancy.
	public void printHotelReport(Hotel hotel) {

		
		System.out.print("Hotel Name: " + hotel.getName() + "\n\nNumber of Rooms: " + hotel.getNumberOfRooms() + "\n\n");
		int index = 1;
		for (Room room : hotel.getRoomsList()) {
			System.out.println("Number of Beds for Room " + index + ": " + room.getNumberOfBeds() + "\n");
			index++;
			for (Bed bed : room.getBedsList()) {
				System.out.println(bed.getSizeBed() + "\n");
			}
		}
		if (hotel.isHasVacancies() == true) {
			System.out.println("There is room available for booking.\n");
		} else if (hotel.isHasVacancies() == false) {
			System.out.println("There is no room available for booking.\n");
		}

		System.out.println("The Max Occupancy: " + hotel.maxOccupancy());
	}

}
