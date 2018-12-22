public class Hotel{
	private Reservation[]reservations;
	private int size;
	Reservation rev = new Reservation();

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
		String str = "";
		str += rev.getpersonName() +" " +rev.getroomNumber();
		System.out.println(str);
	}


}