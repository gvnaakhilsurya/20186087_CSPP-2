import java.util.*;
import java.text.*;

/*
*This class is for Appointment in which consists of
*date and selected time as String and integer datatypes
*which stores date and given time in minutes.
*/
class Appointment {

	String date;
	int selectedTime;
	Date bookedDate;

	Appointment(String date , int selectedTime) {
		this.date = date;
		this.selectedTime = selectedTime;
	}

	/*
	*This is a getter method of accessing a particular date
	*in String type.
	*/
	public String getDate() {
		return this.date;
	}

	/*
	*This method converts given String date to Date format which is
	*useful in the further implementations such as comparing days,months,
	*years,minutes,hours and seconds
	*/
	public Date getConvertedDate(String dateToBeConverted) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		try{
			bookedDate = sdf.parse(dateToBeConverted);
		} catch(Exception e) {
			System.out.println(e);
		}
		return bookedDate;
	}

	public int getselectedTime() {
		return this.selectedTime;
	}

	public String toString() {
		return "" + date + " " + selectedTime + " mins";
	}
}
