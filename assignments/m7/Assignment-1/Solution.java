import java.util.Scanner;
/**.
 * It is the class.
 */
class InputValidator {
    /**.
     * It is attributes declaration.
     */
    private String input;
    /**.
     * Constructs the object.
     *
     * @param      input  The input
     */
    InputValidator(final String input) {
        /**.
         * It is counstructor.
         */
        this.input = input;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    Boolean validateData() {
        /**.
         * It is the conditional method.
         */
        final int six = 6;
        if (input.length() >= six) {
            return true;
        }
        return false;
    }
}
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private  Solution() {
        /**.
         * It is counstructor.
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * It is the main class description.
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
}
}
