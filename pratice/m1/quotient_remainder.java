import java.util.*;
class quotient_remainder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		float quotient = a / b;
		float remainder = a % b;
		System.out.println(quotient);
		System.out.println(remainder);	 

	}
}