import java.util.Scanner;
/**.
 * This program is for printing quadratic equation.
 */
final public class Solution {
    private Solution() {
        /**.
         * this is constuctor
         */
    }
    /**.
     * This is a function for printing quadratic equation
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        equation(a, b, c);
    }
    /**.
     * This is a function for printing quadratic equation
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void equation(final int a,final int b,final int c) {
        long d = (b * b) - (4 * a * c);
        double root1 = (-b + (Math.sqrt(Math.abs(d)))) / (2 * a);
        double root2 = (-b - (Math.sqrt(Math.abs(d)))) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}
