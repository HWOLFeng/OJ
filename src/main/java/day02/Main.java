package day02;

import java.util.*;
/*
指定位数
回文数
 */
public class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 10000; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            Boolean flag = true;
            for (int j = 0; j < len / 2; j++) {
                if (str.charAt(j) != str.charAt(len - 1 - j)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;
            int tem = i;
            int ans = 0;
            while (tem > 0) {
                ans += tem % 10;
                tem /= 10;
            }
            if (ans == n) System.out.println(i);
        }
    }
}