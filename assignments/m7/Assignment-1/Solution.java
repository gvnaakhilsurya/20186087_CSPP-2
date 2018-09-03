import java.util.*;
class InputValidator
{
	int length;
	String input;
	InputValidator(String input)
	{
		this.input = input;
		
	}
	boolean validateData()
	{
		if (input.length()>=6){
			return true;	
		}else{
			return false;
		}
		
	}
	
}
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	InputValidator i=new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
