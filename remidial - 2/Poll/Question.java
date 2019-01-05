class Question{
	String question;
	String[]options;

	public Question(String question,String[]options){
		this.question = question;
		this.options = options;

	}

	 public String getQuestion(){
	  return question;
	 }
	 
	 public void setQuestion(String question){
	  this.question = question;
	 }
	  public String[] getOptions(){
	   return options;
	  }
	  
	  public void setOptions(String[] options){
	   this.options = options;
	  }

	  public void setOptionVotes(String option){

	  }
	  public String indexOf(String option){
	  	return null;
	  }
	  public String getText(){
	  	return null;

	  }
	  public int commonSelectedOption(){

	  	return 0;
	  }

}