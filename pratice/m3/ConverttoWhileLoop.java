import java.util.*;
/**
 * Class for convertto while loop.
 */
class ConverttoWhileLoop{
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**
		 * { var_description }
		 */
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i = 1 ;
		while (i <= n) {
			if (i % 2 == 0){
				System.out.println(i);

			}i = i +1;
			    
		}System.out.println("GOOD BYE!");
        
	}
}