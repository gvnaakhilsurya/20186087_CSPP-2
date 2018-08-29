
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
	public static void counter(int n){
		int count = 0;
		for (int i=1 ;i <n ;i++){
			int j = i;
			while(j!=0){
				int c = j%10;
				j = j/10;
				if (c ==7 ){
					count = count +1;
		        }
            
            }
				
		}
		System.out.println(count);
	}
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        counter(n);
    
	}
}