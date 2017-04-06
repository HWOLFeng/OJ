package day09;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/28.
 */
public class ChangBottle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = scanner.nextInt();
        }
        long count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (a[i]!=i){
                int temp = a[i];
                for (int j = i; j < a.length; j++) {
                    if (a[j] == i){
                        a[i] = a[j];
                        a[j] = temp;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
