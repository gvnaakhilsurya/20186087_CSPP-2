/**
 * @author: akhil.
 */
import java.util.Scanner;
/**
* Do not modify this main function.
*/
public final class Solution {
/**
* This is yhe main class.
*/
    private Solution() {
/**
* it is a countructor.
*/
    }
/**
* @param      n     int.
*/
    public static void counter(final int n) {
/**
* it is the method.
*/
        int count = 0;
        final int xVAR = 7;
        final int yVAR = 10;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j != 0) {
                int c = j % yVAR;
                j = j / yVAR;
                if (c == xVAR) {
                    count = count + 1;
                }
            }
    }
        System.out.println(count);
    }
    /**
     * @param args are of string type.
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        counter(n);
    }
}
