
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
	public static int gcd(int a,int b){
		if (a==b) {
			return a;
		} else if (a == 0){
			return b;
		} else if (b==0){
			return a;
		} else if (a > b){
			return gcd(a%b,b);
		} else{
			return gcd(a,b%a);
		}
	}

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println( gcd(n1,n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
		}
