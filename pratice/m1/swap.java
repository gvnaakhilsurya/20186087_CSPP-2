import java.util.*;
class swap{

	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	int a = sc.nextInt();
	 	System.out.println(" a value :"+a);
	 	int b = sc.nextInt();
	 	int temp;
	 	System.out.println("b value :"+b);
	 	temp = a;
	 	a = b;
	 	b = temp;
	 	System.out.println("after swap");
	 	System.out.println("print a value :"+a);
	 	System.out.println("print b value :"+b);

		
	}
}