import java.util.*;
class Question{
	String question;
	String[]options;
	Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
	
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

	  public void setOptionVotes(int option){
	  	int count=0;
  		// System.out.println(this.options[option]);
  		// System.out.println((ht.containsKey(this.options[option])));
		if (ht.containsKey(this.options[option])) {
			count = ht.get((this.options[option]));
			ht.put(this.options[option], count+1);
		} else {
			ht.put(this.options[option], 1);
		}
		// System.out.println(ht);

	  }
	  public int indexOf(String option){
	  	for (int i = 0;i < options.length;i++) {
	  		if (option.equals(this.options[i])) {
	  			return i;
	  		}
	  	}
	  	return -1;
	  	
	  }
	  public String getText(){
	  	return this.question;

	  }
	  public String commonSelectedOption(){
		String maxKey=null;
		Integer maxValue = Integer.MIN_VALUE; 
		for(Map.Entry<String,Integer> entry : ht.entrySet()) {
		     if(entry.getValue() > maxValue) {
		         maxValue = entry.getValue();
		         maxKey = entry.getKey();
		         // System.out.println(maxValue);
		     }
		     
		}
		return maxKey;

	  }

}