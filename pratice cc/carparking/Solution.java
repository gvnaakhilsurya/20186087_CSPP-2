public class Solution {
	public static void main(String[] args) {
		Parking parking = new Parking(10);

		if (parking.carsCount() == 0) {
			System.out.println("Testcase 1 passed");
		} else {
			System.out.println("Testcase 1 failed");
		}

		parking.addToSlot(new Slot("Murthy"));

		if (parking.getSlot("Murthy").getName().equals("Murthy")) {
			System.out.println("Testcase 2 passed");
		} else {
			System.out.println("Testcase 2 failed");
		}
		
		parking.addToSlot(new Slot("Vamshi"));
		System.out.print(parking);
		parking.addToSlot(new Slot("Deepak"));
		parking.addToSlot(new Slot("Rajni"));

		System.out.println(parking.getSlot("Deepak"));
		if (parking.getSlot("Deepak") != null) {
			System.out.println("Testcase 3 passed");
		} else {
			System.out.println("Testcase 3 failed");	
		}


		// System.out.println(parking.carsCount());
		if (parking.carsCount() == 4) {
			System.out.println("Testcase 4 passed");
		} else {
			System.out.println("Testcase 4 failed");
		}

		parking.removeFromSlot("Rehana");

		if (parking.carsCount() == 4) {
			System.out.println("Testcase 5 passed");
		} else {
			System.out.println("Testcase 5 failed");
		}

		System.out.print(parking);

		parking.removeFromSlot("Deepak");

		if (parking.carsCount() == 3) {
			System.out.println("Testcase 6 passed");
		} else {
			System.out.println("Testcase 6 failed");
		}

		if (parking.getSlot("Deepak") == null) {
			System.out.println("Testcase 7 passed");
		} else {
			System.out.println("Testcase 7 failed");	
		}
		System.out.println(parking.getEmptySlots());

		if (parking.getEmptySlots() == 7) {
			System.out.println("Testcase 8 passed");
		} else {
			System.out.println("Testcase 8 failed");
		}

		System.out.print(parking);
		parking.clearSlots();
		
		if (parking.carsCount() == 0) {
			System.out.println("Testcase 9 passed");
		} else {
			System.out.println("Testcase 9 failed");
		}
		// System.out.println(parking.getEmptySlots());

		// System.out.println(parking.getEmptySlots());

		if (parking.getEmptySlots() == 0) {
			System.out.println("Testcase 10 passed");
		} else {
			System.out.println("Testcase 10 failed");
		}

	}
}