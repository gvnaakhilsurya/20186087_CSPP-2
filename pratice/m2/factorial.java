import java.util.*;
class factorial{
	public static long factcheck(long x){
		long result;
		if (x == 1)
			return 1;
		else
			result = factcheck(x-1)*x;
		return result;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num = sc.nextInt();
		System.out.println("It's factorial is:");
		System.out.println(factcheck(num));

	}
}