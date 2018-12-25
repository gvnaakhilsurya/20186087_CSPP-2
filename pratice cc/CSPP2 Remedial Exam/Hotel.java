import java.util.*;
public class Hotel{

	Reservation[]rooms;
	int size;



	public Hotel(){
		this.rooms = new Reservation[5];
		this.size = 0;
	}
	public int reserveRoom(String person){
		if(this.size == rooms.length){
			System.out.println("All Rooms are reserved");
		}
		int num = 1;
		int i = 0;
		for (i = 0;i < rooms.length-1;i++) {
			rooms[num + i] = new Reservation(person, num+i);
		}
		size++;
		// System.out.println(size);
		return size;
		}
		
	public boolean reserveRoom(String person,int roomNumber){
		if (rooms[roomNumber-1] != null) {
			return false;
		}else{
			// rooms[roomNumber-1] = new Reservation(person);
			// size++;
			// System.out.println(size);
		return true;
	}

	}

	public void printReservations(){
		for (int i = 1;i < this.size ;i++) {
			System.out.println(rooms[i]);
		}
	}
}