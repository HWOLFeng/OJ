package day10;

/**
 * Created by HWOLF on 2017/3/29.
 */
import java.util.Scanner;

public class Max_Caculation_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long temp;
        long[][] arr = new long[n][k + 1];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt() + (i > 0 ? arr[i - 1][0] : 0);
        }
        sc.close();
        for(int a = 1; a < n; a++) {
            for(int b = 1; b <= k; b++) {
                for(int c = 0; c < a; c++) {
                    temp = arr[a][0] - arr[c][0];
                    arr[a][b] = Math.max(arr[c][b - 1] * temp, arr[a][b]);
                }
            }
        }
        System.out.println(arr[n - 1][k]);
    }
}

