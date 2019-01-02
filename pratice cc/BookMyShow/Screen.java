import java.util.Arrays;
public class Screen{
	String movie;
	Show[] shows;
	String[] showTimes;

	public Screen(){
		this.shows = new Show[5];
		for (int i = 0; i < shows.length; i++) {
			shows[i] = new Show();
		}
	}
	public void setMovie(String movie){
		this.movie = movie;
	}
	public String getMovie(){
		return this.movie;
	}
	public Show[] getShows(){
		// System.out.println(Arrays.toString(shows));
	   return shows;
	}
	 
	// public String[] getShowTimes(){
	// 	return this.showTimes;
	// }
	  
	public void setShowTimes(String[] times){
	    for (int i = 0;i < this.shows.length;i++) {
	    	// System.out.println(this.showTimes[i]);
	    	shows[i].setShowTime(times[i]);
	    	// System.out.println(Arrays.toString(times));
	    }
	}
}