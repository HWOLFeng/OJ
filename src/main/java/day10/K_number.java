package day10;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/28.
 */
public class K_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L, K, sum = 0;
        K = scanner.nextInt();
        L = scanner.nextInt();
        int[][] dp = new int[L][K];
        for (int i = 0; i < K; i++) dp[0][i] = 1;
        dp[0][0] = 0;
        if (L > 1) {
            for (int i = 1; i < L; i++) {
                for (int j = 0; j < K; j++) {
                    for (int k = 0; k < K; k++) {
                        if (k != j - 1 && k != j + 1) {
                            dp[i][j] += dp[i - 1][k];
                            dp[i][j] %= 1000000007;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < K; i++) {
            sum += dp[L - 1][i];
            sum %= 1000000007;
        }
        System.out.println(sum);
    }
}
