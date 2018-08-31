
// Given an String, Write a java method that returns the decimal value for the given binary string.

import java.util.*;
class test1{
	public static String reverse(String s){
		String x = "";
		for(int i = 0; i<s.length() ;i++){
			x = s.charAt(i) + x;
		}return x;

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverse(s));

		}
	}
