
// Given an String, Write a java method that returns the decimal value for the given binary string.

import java.util.Scanner;
class Solution{
	public static void binarytodecimal(String s){
		int s1 =Integer.parseInt(s); 
		int decimal = 0,i = 0;
		while(s1!=0) {
			decimal += ((s1 % 10)* Math.pow(2,i));
			s1 = s1/10;
			i++;
		}System.out.println(decimal);


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0 ;i<n;i++){
			String s = sc.nextLine();
			binarytodecimal(s);
		}
		

	}
}