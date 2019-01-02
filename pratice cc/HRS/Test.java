import java.util.*;
class Test{
	public static void mystery(int i,int j){
		while(i != 0&& j!= 0){
			i = i/j;
			j = (j-1)/2;
			System.out.println(i+" "+j+" ");
		}
		System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mystery(1600 , 40);


	}
}
