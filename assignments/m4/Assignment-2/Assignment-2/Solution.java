import java.util.Scanner;
/**. main class.
*/
final class Solution {
    /**.addition of matrices*/
    private Solution() {
        /**.
        it is constructor.
        */
    }
    /**.
    @param args the arguments
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int p = s.nextInt();
        int q = s.nextInt();
        int[][] ar = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        int[][] newarray = new int[n][m];
    if (n == p && m == q) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newarray[i][j] = arr[i][j] + ar[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    System.out.print(newarray[i][j]);
                } else {
                    System.out.print(newarray[i][j] + " ");
                }
            }
        System.out.println();
        }

} else {
        System.out.println("In valid");
    }
    }
}
