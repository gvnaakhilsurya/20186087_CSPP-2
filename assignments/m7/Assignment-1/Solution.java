import java.util.*;
/**
 * It is the class.
 */
class InputValidator
{
    /**
     * It is attributes ddeclaration.
     */
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
        if (input.length() >= 6) {
            return true;    
    }    else {
            return false;
        }
    }
}
public class Solution
{
    private  Solution()
    {
        /**
         * It is counstructor.
         */
    }
    /**
     * It is the main class.
     */
    public static void main(final String args [])
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
