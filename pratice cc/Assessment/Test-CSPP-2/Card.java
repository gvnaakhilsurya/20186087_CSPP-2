import java.util.*;
class Card{
	String bookTitle;
	String bookAuthor;
	String bookSubject;

	public Card(String bookTitle,String bookAuthor,String bookSubject){
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookSubject = bookSubject;
	}
	 public String getbookTitle(){
	  return this.bookTitle;
	 }
	 
	 public void setbookTitle(String bookTitle){
	    this.bookTitle = bookTitle;
	 }

	 public String getbookAuthor(){
	  return this.bookAuthor;
	 }
	 
	 public void setbookAuthor(String bookAuthor){
	  	this.bookAuthor = bookAuthor;
	 }

	  public String getbookSubject(){
	   return this.bookSubject;
	  }
	  
	  public void setbookSubject(String bookSubject){
	    this.bookSubject = bookSubject;
	  }
	public String toString(){
		String str = "";
		str = "Book Title:" + this.bookTitle +", "+"Author:" + this.bookAuthor + ", " + "Subject:" + this.bookSubject;
		return str;
	}


}