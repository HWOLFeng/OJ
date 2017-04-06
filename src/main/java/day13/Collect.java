package day13;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/4/5.
 */
public class Collect {
    static int n;
    static int count[][], s[][];
    static int value[], sum[];

    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        value = new int[n];
        sum = new int[n + 1];
        s = new int[n][n];
        for (int i = 0; i < n; i++)
            value[i] = reader.nextInt();
        sum[0] = 0;
        for (int i = 1; i <= n; i++)
            sum[i] = sum[i - 1] + value[i - 1];
        count = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            count[i][i + 1] = value[i] + value[i + 1];
            s[i][i + 1] = i;
        }
        for (int i = n - 3; i >= 0; i--) {
            for (int j = i + 2; j < n; j++) {
                count[i][j] = count[i][i] + count[i + 1][j];
                s[i][j] = i;
                for (int k = s[i][j - 1]; k <= s[i + 1][j]; k++) {
                    if (k < j) {
                        int ccount = count[i][k] + count[k + 1][j];
                        if (ccount < count[i][j]) {
                            s[i][j] = k;
                            count[i][j] = ccount;
                        }
                    }
                }
                count[i][j] += sum[j + 1] - sum[i];
            }
        }
        System.out.println(count[0][n - 1]);
    }
}
