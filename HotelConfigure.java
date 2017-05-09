import java.util.*;
/*
 *  Author Lambros Lambri
 *  Date: 15th December 2016 
 *  Class CSC1021
 *  This class lets the user input information about the hotel by entering the hotel name, the amount of rooms, the amount of beds for each room, if each room is vacant, the size of the bed and the max occupancy.
 */

public class HotelConfigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Room r = new Room();
		Hotel h = new Hotel();
		System.out.println("Input the name of the Hotel");
		h.setName(sc.nextLine());
		int numberOfRooms = 0;
		// This is a do while loop that has a try catch control structure for
		// Number of Rooms below or equal to 0 and a Mismatch Exception
		do {
			System.out.println("Enter number of rooms");
			try {
				numberOfRooms = sc.nextInt();
				if (numberOfRooms <= 0) {
					System.out.println("Invalid cant accept values below 0 ");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid number of rooms. ");
			}
			sc.nextLine();
		} while (numberOfRooms <= 0);

		for (int i = 0; i < numberOfRooms; i++) {
			h.addRoom(new Room());
			System.out.println("Is the Room " + (i + 1) + " vacant? Please answer by True or False.");
			String vacant = sc.nextLine().toLowerCase();
			// If the input is not equals to true or false this will make the
			// user input the line again.
			while (!vacant.equals("true") && !vacant.equals("false")) {
				System.out.println("Type True or False");
				vacant = sc.nextLine().toLowerCase();
			}
			// Depending on the input true or false it will return if the room
			// is vacant or not.
			if (vacant.equals("true")) {
				h.setHasVacancies(true);

			} else if (vacant.equals("false")) {
				h.setHasVacancies(false);
			}
			int numberOfBeds = 0;
			// Another do while loop that has a try catch control structure for
			// Number of Beds below or equal to 0 and Mismatch Exception
			do {
				System.out.println("Enter how many Beds for Room " + (i + 1));
				try {
					numberOfBeds = sc.nextInt();

					if (numberOfBeds <= 0) {
						System.out.println("Invalid cant accept values below 0");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid number of Beds. ");
				}
				sc.nextLine(); // clears the buffer
			} while (numberOfBeds <= 0);

			for (int k = 0; k < numberOfBeds; k++) {

				System.out.println("Enter the size of your bed ");

				String size = sc.nextLine().toLowerCase();
				// If the input is not equals to single or double this will make
				// the user input the line again.
				while (!size.equals("single") && !size.equals("double")) {
					System.out.println("Type Single Or Double for size.");
					size = sc.nextLine().toLowerCase();
				}
				// If the input is equals to single or double it will get the
				// value.
				while (size.equals("single")) {
					h.getRoomsList().get(i).addBed(new Bed("Single"));
					break;
				}
				while (size.equals("double")) {
					h.getRoomsList().get(i).addBed(new Bed("Double"));
					break;
				}

			}
		}

		HotelReport report = new HotelReport(h);
	}
}