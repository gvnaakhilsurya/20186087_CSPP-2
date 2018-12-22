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
		Reservation rev = new Reservation(person);
		int i = 1;
		if (size < reservations.length) {
			for ( i = 1;i < reservations.length;i++) {
				reservations[i] = rev;
			}
			return i;
		}
		return 0;
		
	}
	public boolean reserveRoom(String person,int roomNum){
		Reservation rev = new Reservation(person,roomNum);
		if (reservations[roomNum] == null) {
			reservations[roomNum] = rev;
			return true;
		}
		return false;

		
	}
	public void printReservations(){
		String str = "";
		str += rev.getpersonName() +" " +rev.getroomNumber();
		System.out.println(str);
	}


}