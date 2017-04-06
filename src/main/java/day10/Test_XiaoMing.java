package day10;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/30.
 */
public class Test_XiaoMing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeTemp = scanner.nextInt();
        int n = scanner.nextInt();
        int[] time = new int[n];
        int[] value = new int[n];
        int[][] sum = new int[n][timeTemp];
        for (int i = 0; i < n; i++) {
            time[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
        }
        while (timeTemp > 0) {
            //i 为组数，j为剩余时间
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum[i][j] = i == 0 ? 0 : sum[i - 1][j];
                    if (i > 0 && timeTemp >= 0) {
                        sum[i][j] = Math.max(sum[i - 1][timeTemp - time[j]] + value[j],
                                sum[i - 1][timeTemp]);
                    }
                }
            }
        }
    }
}
