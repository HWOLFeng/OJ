package day05;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/18.
 */
public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("请输入数组：");
        for (int i = 0; i < A.length; i++) {
            int temp = sc.nextInt();
            A[i] = temp;
        }
        InsertSort(A);
    }

    public static void InsertSort(int[] A) {
        int temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] < A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }


        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
