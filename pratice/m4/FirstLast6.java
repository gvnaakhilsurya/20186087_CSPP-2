
import java.util.*;
class FirstLast6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array Elements");
		for (int i = 0;i<n;i++){
			a[i]= sc.nextInt();
		}
		if(a[0] == 6 || a[a.length - 1] == 6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}