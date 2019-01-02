class Task{
	String title;
	String assignedTo;
	int timeTocomplete;
	boolean important;
	boolean urgent;
	String status;

	public Task(String title, String assignedTo,int timeTocomplete, boolean important,
		boolean urgent,String status){
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeTocomplete = timeTocomplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}
	 public String getTitle(){
	  return title;
	 }
	 
	 public void setTitle(String title){
	  this.title = title;
	 }
	  public String getAssignedTo(){
	   return assignedTo;
	  }
	  
	  public void setAssignedTo(String assignedTo){
	   this.assignedTo = assignedTo;
	  }
	   public int getTimeTocomplete(){
	    return timeTocomplete;
	   }
	   
	   public void setTimeTocomplete(int timeTocomplete){
	    this.timeTocomplete = timeTocomplete;
	   }
	    public boolean getImportant(){
	     return important;
	    }
	    
	    public void setImportant(boolean important){
	     this.important = important;
	    }
	     public boolean getUrgent(){
	      return urgent;
	     }
	     
	     public void setUrgent(boolean urgent){
	      this.urgent = urgent;
	     }
	     public String Isimportant(boolean flag){
	     	if (flag == true) {
	     		return "Important";
	     	}
	     	return "Not Important";
	     }
	     public String Isurgent(boolean flag){
	     	if (flag == true) {
	     		return "Urgent";
	     	}
	     	return "Not Urgent";
	     }
	     public String toString(){
	     	String str = "";
	     	str = this.title + ", "+this.assignedTo + ", "+this.timeTocomplete+
	     	", "+Isimportant(this.important)+", "+Isurgent(this.urgent)+", "+this.status;
	     	return str;
	     }
}