import java.util.*;
public class Show{
	String showTime;
	String[] tickets;
	int availableSeatsCount = 150;

	public Show(){
		this.showTime = showTime;
		this.tickets = new String[20];

	}
	 public String getShowTime(){
	  return showTime;
	}
	  
	public void setShowTime(String showTime){
	   this.showTime = showTime;
	}
	 
	 public int availableSeatsCount(){
	 	// System.out.println(availableSeatsCount);
	 	return availableSeatsCount;
	 }

	 public boolean bookTickets(String[]tickets){
	 	this.tickets = tickets;
	 	if (tickets.length<availableSeatsCount) {
	 		for (int i = 0;i < tickets.length;i++) {
	 			// System.out.println(tickets[i]);
	 			availableSeatsCount--;
	 		}
	 		return true;
	 	}
	 	return false;
	 }
	 public String[] showAllBookings(){
	 	String[]result = new String[tickets.length];
	 	System.arraycopy(tickets,0,result,0,tickets.length);
	 	return result;
	 }

}