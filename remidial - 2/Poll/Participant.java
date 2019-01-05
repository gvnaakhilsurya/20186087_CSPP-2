class Participant{
	private String name;
	private int option;
	private String optedname;

	public Participant(String name,int option,String optedname){
		this.name = name;
		this.option = option;
		this.optedname = optedname;

	}
	 public String getName(){
	  return name;
	 }
	 
	 public void setName(String name){
	  this.name = name;
	 }
	  public int getOption(){
	   return option;
	  }
	  
	  public void setOption(int option){
	   this.option = option;
	  }
	   public String getOptedname(){
	    return optedname;
	   }
	   
	   public void setOptedname(String optedname){
	    this.optedname = optedname;
	   }
}