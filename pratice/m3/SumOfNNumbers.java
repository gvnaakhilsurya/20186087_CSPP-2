 import java.util.*;
class SumOfNNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int s = 0;
		for(int i=1;i<=n;i++){
			 s = s + i;
		}
		System.out.println(s);
        
	}
}