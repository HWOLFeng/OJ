package day01;

import java.util.*;

/**
 * Created by HWOLF on 2017/2/9.
 */
public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0, r = 1, a = 2;
        int mod = 10007;
        int[] f = new int[3];
        f[0] = 1;
        f[1] = 1;
        for (int i = 0; i < n; i++) {
            f[a] = (f[l] + f[r]) % mod;
            a = (a + 1) % 3;
            l = (l + 1) % 3;
            r = (r + 1) % 3;
        }
        System.out.println(f[a]);
    }
}
