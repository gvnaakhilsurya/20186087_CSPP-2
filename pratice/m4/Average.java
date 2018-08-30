import java.util.*;
 class Average{
 	public static float average(int[] a){
 		float avg;
 		float sum = 0;
 		for (int i : a){
 			sum = sum +i;
 		}
 		avg = sum/a.length;
 	return avg;	
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
 		 System.out.println("Average" + average(a));
 		 

}    }