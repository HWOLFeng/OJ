package day10;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/28.
 */
public class Tanxin_ThreeNumberPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        if (a % 2 == 0) {
            if (f(a, a - 3) != 1) {
                System.out.println((a - 1) * (a - 2) * (a - 3));
            } else {
                System.out.println(a * (a - 1) * (a - 3));
            }
        } else {
            System.out.println(a * (a - 1) * (a - 2));
        }
    }

    public static long f(long a, long b) {
        long temp = 1;
        while (temp != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
