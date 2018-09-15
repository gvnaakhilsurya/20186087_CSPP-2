import java.util.Scanner;
class Show {
    private String moviename;
    private String dateandtime;
    private String[] seats;
    int seatsize = 0;

    public String getmoviename() {
        return moviename;
    }
    public void  setmoviename(String mn) {
        moviename = mn;
    }
    public String getdateandtime() {
        return dateandtime;
    }
    public void setdateandtime(String dt) {
         dateandtime = dt;
    }
    public String[] getseats() {
        return seats;
    }
    public void setseats(String cts) {
         seats[seatsize++] = cts;
    }

    Show (String mn, String dt,String[]cts) {
        moviename = mn;
        dateandtime = dt;
        seats = cts;
    }
}
class Patron {

    private String username;
    private String mobilenum;

    public String getusername() {
        return username;
    }
    public void  setusername(String un) {
        username = un;
    }
    public String getmobilenum() {
        return username;
    }
    public void  setmobilenum(String mn) {
        mobilenum = mn;
    }

    Patron(String un,String mn) {
        username = un;
        mobilenum = mn;
    }
       
}
class BookYourShow {
    Show[]movielist = new Show[20];
    int movielistsize = 0;
    Patron[] patronlist = new Patron[20];
    int patronsize;
    String[]availableseats = new String[20];

    void addAShow(Show k) {
        movielist[movielistsize++]=k;
    }
    Show getAShow(String mn,String dt) {
        for (int i = 0; i<movielist.length;i++) {
            if ((movielist[i].getmoviename()).equals(mn)) {
                if (movielist[i].getdateandtime().equals(dt)) {
                	System.out.println(movielist[i]);
                    return movielist[i];          
                }
                    
                
                
            }
            
        }
        return null;
    }
    void bookAShow(String mn,String dt,Patron p, String[] ct) {
        int  count = 0;
        if (getAShow(mn,dt) == null) {
        	System.out.println("No show");
        	return;
        }
        if (getAShow(mn,dt) !=null) {
            String[] availableseats = getAShow(mn,dt).getseats();
            for (int i = 0;i < ct.length;i++) {
                for (int j = 0;j < availableseats.length;i++) {
                	System.out.println(availableseats[j]);
                	System.out.println(ct[i]);
                    if (ct[i].equals(availableseats[j])) {
                        getAShow(mn,dt).setseats("N/A");
                        count++;                                 
                    }
                } 
            }
            if (count > 0) {
                patronlist[patronsize++] = p;
                 
             } 
        }
    }
    boolean printTickets(String mn, String dt, String mb) {
        for (int i = 0;i < patronsize;i++) {
            if ((patronlist[i].getmobilenum()).equals(mb)) {
                if(getAShow(mn,dt)!= null) {
                    System.out.println(mb+" "+mn+" "+dt);
                    return true;

                }


                
            }
            
        }
        return false;
    }
    void showAll() {
        String s2 = "[";
        if (movielist.length > 0) {
            for (int i = 0;i < movielist.length;i++) {
                String s1 = "";
                s1 += movielist[i].getmoviename() + ",";
                s1 += movielist[i].getdateandtime() + ",";
                String[]availableseats = movielist[i].getseats();
                for (int j = 0;j <availableseats.length;i++) {
                    s2 = availableseats[j] +",";
                    
                }
                s2 += availableseats[availableseats.length-1] + "]";
                
            }
            System.out.println(s2);
            
        }
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTickets(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}
