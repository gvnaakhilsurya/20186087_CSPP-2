import java.util.*;
class InputValidator
{
    /**
     * It is attributes ddeclaration.
     */
    int length;
    String input;
    InputValidator(String input)
    {
        /**
         * It is counstructor.
         */
        this.input = input;
    }
    boolean validateData()
    {
        /**
         * It is the conditional method.
         */
        if (input.length() >= 6){
            return true;    
        }else{
            return false;
        }
    }
}
public class Solution
{
    /**
     * It is the main class.
     */
    public static void main(String args[])
    {
        /**
         * It is the main class description.
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
