import java.util.*;
class Solution{
 	public static int largenum(int[] a){
 		int max;
 		max = a[0];
 		for (int i : a){
 			if (i > max){
 				max = i;
 			}

 		}return max;
 	}

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the size of an array:");
 		int n = sc.nextInt();
		System.out.println("Enter the array Elements");
 		int a[] = new int[n];
 		for (int i = 0;i<n;i++){
 			a[i]= sc.nextInt();
 		 }
 		 System.out.println(largenum(a));
 		 

}    }