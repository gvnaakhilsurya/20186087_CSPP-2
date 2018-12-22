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
		rev = new Reservation(person);
		int i = 1;
		if (size < reservations.length) {
			for ( i = 1;i < reservations.length;i++) {
				reservations[i] = rev;
				i = i + 1;
			return i;
			}
			
		}
		return -1;
		
	}
	public boolean reserveRoom(String person,int roomNum){
		// Reservation rev = new Reservation(person,roomNum);
		// if (reservations[roomNum] == null && roomNum < reservations.length) {
		// 	reservations[roomNum] = rev;
		// 	return false;
		// }
		return true;

		
	}
	public void printReservations(){
		String str = "";
		for(int i = 0;i< reservations.length;i++){
		str += rev.getpersonName() +" " +rev.getroomNumber();
		System.out.println(str);
	}
	
	}

}