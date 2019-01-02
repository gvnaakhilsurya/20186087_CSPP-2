import java.util.Arrays;
public class Cinema{
	Screen[] allScreens;
	int screenCount;
	int rowsCount;
	int columnCount;


	public Cinema(){
		allScreens = new Screen[2];
		for (int i = 0;i < allScreens.length;i++) {
			 allScreens[i] = new Screen();
		}

	}
	public Cinema(int x,int y, int z){
		screenCount = x;
		rowsCount =y;
		columnCount = z;

	}

	public Screen[] getAllScreens(){
		// System.out.println(Arrays.toString(allScreens));
		return allScreens;
	}
	public void setAllScreens(){

	}

	
}