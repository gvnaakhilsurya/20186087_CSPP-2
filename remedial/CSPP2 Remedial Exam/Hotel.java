public class Hotel{
	private Reservation[]reservations;
	private int size;

	public Hotel(){
		reservations = new Reservation[5];
		size = 0;
	}
	public int size(){
		return size;
	}

	public int reserveRoom(String person){
		// Reservation rev = new Reservation();
		// if (size < reservations.length) {
		// 	for (int i = 1;i< reservations.length;i++) {
		// 		reservations[i] = rev.getpersonName();


		// 	}

		// }
		return 0;

	}
	public boolean reserveRoom(String person,int roomNum){

		return true;
	}
	public void printReservations(){

	}


}