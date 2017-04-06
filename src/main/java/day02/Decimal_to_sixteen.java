package day02;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/14.
 */
public class Decimal_to_sixteen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toHexString(n);
        System.out.println(str.toUpperCase());
    }
}
