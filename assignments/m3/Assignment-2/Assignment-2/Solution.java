
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
	public static void counter(int x){
		int count = 0;
		for (int i=1 ;i <x ;i++){
			int j = i;
			while(j!=0){
				int c = j%10;
				j = j/10;
				if (c ==7 ){
					count = count +1;
		        }
            
            }
				
		}System.out.println(count);	 
	
	}
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt(); 
    
	}
}