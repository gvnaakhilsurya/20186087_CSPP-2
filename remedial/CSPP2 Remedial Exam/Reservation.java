/*
  Reservation class, stores the personName and roomNumber number in the Hotel
*/

public class Reservation{
    //instance variables
    private String personName;
    private int roomNumber;

    public Reservation(){
        
    }

    public Reservation(String personName){
        this.personName = personName;

    }
    public Reservation(String personName,int roomNumber){
        this.personName = personName;
        this.roomNumber = roomNumber;

    }
     public String getpersonName(){
      return personName;
    }
     
    public void setpersonName(String personName){
      this.personName = personName;
    }

    public int getroomNumber(){
       return roomNumber;
    }
      
    public void setroomNumber(int roomNumber){
       this.roomNumber = roomNumber;
    }

    public String toString(){
        String str = "";
        str += personName + " " +roomNumber ;
        return str;
    }


    }
