import java.util.*;
import java.text.*;

/*
*This class has list of the slots which are Appointment type and 
*are useful for creating, cancellation and booking appointments.
*/
class MyCalendar {

	ArrayList<Appointment> slots;
	Date bookedDate;
	
	MyCalendar(String sirName) {
		slots = new ArrayList<Appointment>();
		System.out.println(sirName);
	}

	/*
	*This method returns boolean type and takes Appointment  object as 
	*argument verifies whether given slot matches with the dates that
	*are in the slots list.
	*/
	public boolean createAppointmentSlot(Appointment slot) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		try {
			bookedDate = sdf.parse(slot.getDate());
		} catch(Exception e){
			e.printStackTrace();
		}
		for( int i = 0; i < slots.size(); i++){
			if( (bookedDate.getYear() == (slots.get(i).getConvertedDate(slots.get(i).getDate()).getYear()) ) &&
				(bookedDate.getMonth() == (slots.get(i).getConvertedDate(slots.get(i).getDate()).getMonth()) ) &&
				(bookedDate.getDay() == (slots.get(i).getConvertedDate(slots.get(i).getDate()).getDay()) ) &&
				(bookedDate.getMinutes() + slot.getselectedTime() >= (slots.get(i).getConvertedDate(slots.get(i).getDate()).getMinutes()) ) &&
				(bookedDate.getHours() == (slots.get(i).getConvertedDate(slots.get(i).getDate()).getHours()) ) &&
				(bookedDate.getSeconds() == (slots.get(i).getConvertedDate(slots.get(i).getDate()).getSeconds()) )) {
				return false;
			}else
			return false;
		}
		slots.add(slot);
		return true;

	}

	/*
	*This method verifies given date in string format and return boolena values
	*/
	public boolean bookAppointment(String name, String givenDate , int time, String place) {
		
		for( int i = 0; i < slots.size(); i++){
			if(givenDate.equals(slots.get(i).getDate()) && (time == slots.get(i).getselectedTime())) {
				return true;
			}
		}
		return false;
	}

	/*
	*This method verifies given date and if the match is forun it removes the 
	*appointment
	*/
	public boolean cancelAppointment(String cancelDate) {

		for( int i = 0; i < slots.size(); i++){
			if(cancelDate.equals(slots.get(i).getDate())) {
				return true;
			}
		}
		return false;
	}
}



