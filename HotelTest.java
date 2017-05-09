/*
 *  Author Lambros Lambri
 *  Date: 15th December 2016 
 *  Class CSC1021
 *  This class tests if the code runs smoothly.
 */

public class HotelTest {
	// Call the runTests method.
	public static void main(String[] args) {
		HotelTest h = new HotelTest();
		h.runTests();
	}

	public void runTests() {
		Hotel hotel = new Hotel();
		hotel.setName("Hilton");
		Room room1 = new Room();
		Room room2 = new Room();
		room1.addBed(new Bed("Single"));
		room2.addBed(new Bed("Double"));
		room2.addBed(new Bed("Single"));
		hotel.addRoom(room1);
		hotel.addRoom(room2);
		hotel.setHasVacancies(true);
		HotelReport report = new HotelReport(hotel);

	}
}
