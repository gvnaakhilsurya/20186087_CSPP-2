/**
* @author : gvnaakhilsurya.
*/
import java.util.Scanner;
/**
* It is the main class.
*/
public final class Solution {
/**.
* It is the definition of main class.
**/
     private Solution() {
/**
* it is counstructor.
*/
     }
/**
* @param      a     array
*
* @return     int
*/
    public static int largenum(final int[] a) {
/**.
* It is the method of the main class.
*/
        int max;
        max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
    }
    }   return max;
    }
    /**
     * main class.
     *
     * @param   args  declaration.
     */
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
         System.out.println(largenum(a));
}   }

