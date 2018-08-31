/**
* @author:gvnaakhilsurya
*/
// Given an String, Write a java method that returns the decimal
//value for the given binary string.
import java.util.Scanner;
/**
* Class for solution.
*/
class  Solution {
/**
* It is the main class.
     *
**/
    private Solution() {
/**
 * It is the counstructor.
*/
}
/**
* @param      s    string.
*/
    public final  static void binarytodecimal(final String s) {
/**
* It is method for binary to decimal.
*/
        long s1 = Long.parseLong(s);
        long decimal = 0, i = 0;
        while (s1 != 0) {
            decimal += ((s1 % 10) * Math.pow(2,i));
            s1 = s1 / 10;
            i++;
}
        System.out.println(decimal);
}
/**
* It converts the binary number to decimal.
*
* @param      args  The arguments
*/
    public static void main(final String[] args) {
/**
* It is the main class.
*/
        Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
        for (int i = 0;i < n ;i++) {
            String s = sc.nextLine() ;
            binarytodecimal(s);
    }     
    }
}