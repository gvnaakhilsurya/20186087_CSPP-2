import java.util.*;
class conversion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter degree temparature :");
		double degrees =sc.nextDouble();
		double fheat = (degrees * 1.8) + 32;
		System.out.println(fheat);

	}
}