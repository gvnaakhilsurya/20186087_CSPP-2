
// Given an String, Write a java method that returns the decimal value for the given binary string.

import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
    /**
     * It is used to reverse the string.
     * @param      s    string
     *
     * @return     string
     */
    public static String reverse(final String s) {
        /**
         * x = empty string
         * s = string input to yhe function.
         */
        String x = "";
        for(int i = 0; i < s.length(); i++) {
            x = s.charAt(i) + x;
    }
        return x;
    }
    /**
     * main class.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * s = string.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));

    }
    }
