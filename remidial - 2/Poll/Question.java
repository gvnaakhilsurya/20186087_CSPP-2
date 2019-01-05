import java.util.*;
class Question{
	String question;
	String[]options;
	Hashtable<String,Integer> h;



	public Question(String question,String[]options){
		this.question = question;
		this.options = options;

	}

	 public String getQuestion(){
	  return question;
	 }
	 
	 public void setQuestion(String question){
	 
	 }
	  public String[] getOptions(){
	   return options;
	  }
	  
	  public void setOptions(String[] options){
	   this.options = options;
	  }

	  public void setOptionVotes(int optionnum){
	  	// ArrayList<Integer>result = new ArrayList<Integer>();
	  	// int i = 1;
	  	// if (result.get(optionnum)==0) {
	  	// 	result.add(optionnum,i);
	  	// }else{
	  	// 	result.add(optionnum,i++);
	  	// }
	  	
	  }
	  public int indexOf(String option){
	  	for (int i = 0;i < options.length;i++) {
	  		if (option.equals(options[i])) {
	  			return i;
	  		}
	  	}
	  	return -1;
	  	
	  }
	  public String getText(){
	  	return this.question;

	  }
	  public String commonSelectedOption(){
	  	return null;
	 
	  	

	  }

}