package day10;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/28.
 */
public class RentShoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(f(m, n));
    }

    public static int f(int m, int n) {
        if (m < n) return 0;
        else if (n == 0) return 1;
        else return f(m - 1, n) + f(m, n - 1);
    }
}
