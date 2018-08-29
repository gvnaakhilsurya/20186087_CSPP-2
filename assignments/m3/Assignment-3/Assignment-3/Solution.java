
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public final  class Solution {
    /**.
     * It explains the main class.
     **/
    private Solution(){
        /**.
         * It is a counstuctor.
         */

    }
    /**.
     * @param      a     { int }
     * @param      b     { int }
     *
     * @return     { int }
     */
    public static int gcd(final int a, final int b){
        /**.
         * It is the method for GCD.
         */
        if (a == b) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a > b) {
            return gcd(a % b, b);
        } else {
            return gcd(a, b % a);
        }
    }
    public static void main(final String[] args) {
        /**.
         * it is the main class.
         */
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println( gcd(n1, n2));
    }
    /*
    Need to write the gcd function and print the output.
    */
}
