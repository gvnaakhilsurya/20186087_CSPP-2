import java.util.Scanner;
/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */
/**.
 * Class for fibonacci.
 */
public class Fibonacci
{
    /**.
     * { item_description }
     */
    private Fibonacci() {
        /**.
         * { item_description }
         */
    }
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**.
     * { function_description }
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static List fib(final int n) {
        /**.
         * it is the main class.
         */
        List fibo = new List(n);
        int element1 = 0;
        int element2 = 1;
        int temp=0;
        fibo.add(element1);
        fibo.add(element2);
        for(int j = 2; j < n; j++)
        {
            temp = fibo.get(j-1) + fibo.get(j-2);
            fibo.add(temp);
        }
        return fibo;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}