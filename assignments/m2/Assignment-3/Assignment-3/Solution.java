import java.util.Scanner;

public class Solution {
	public static int power(int base,int exponent){
		// int result = 1;
		{
			if (exponent>0)
				return	base * power(base,exponent-1);
			return 1;
			
		}

	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result=power(base,exponent);
        System.out.println(result);
	}
	/*
	Need to write the power function and print the output.
	*/
}
