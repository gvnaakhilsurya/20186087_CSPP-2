import java .util.*;
class variation{
	public static void condition(int x,int y){
		if (x > y)
			System.out.println("Bigger");
		else if (x == y)
			System.out.println("Equal");
		else 
			System.out.println("smaller");

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter VarA value :");
		int varA = sc.nextInt();
		System.out.println("Enter varB value :");
		int varB = sc.nextInt();
		condition( varA,varB);
	}
}