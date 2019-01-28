class Wallet{
	String name;
	long amount;

	public Wallet(){

	}
	public Wallet(String name){
		name = this.name;
		amount = this.amount;

	}
	 public String getName(){
	  return name;
	 }
	 
	 public void setName(String name){
	  this.name = name;
	 }

	  public long getamount(){
	   return amount;
	  }

	   
	   public void setamount(long newamount){
	    this.amount = newamount;
	   }

}