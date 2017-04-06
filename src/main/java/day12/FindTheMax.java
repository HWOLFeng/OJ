package day12;

/**
 * Created by HWOLF on 2017/4/3.
 */
/*
　　给n个有序整数对ai bi，你需要选择一些整数对
使得所有你选定的数的ai+bi的和最大。并且要求你选定的数对的ai之和非负，bi之和非负。
输入格式
　　输入的第一行为n，数对的个数
　　以下n行每行两个整数 ai bi
输出格式
　　输出你选定的数对的ai+bi之和
样例输入
5
-403 -625
-847 901
-624 -708
-293 413
886 709
样例输出
1715
数据规模和约定
　　1<=n<=100
　　-1000<=ai,bi<=1000
 */

import java.util.*;

public class FindTheMax {
    public static void main(String[] args) {
        int max = 0, aa = 0, bb = 0;
        boolean k = true;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ai = new int[n];
        int[] bi = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = in.nextInt();
            bi[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if ((ai[j] + bi[j]) < (ai[j + 1] + bi[j + 1])) {
                    aa = ai[j];
                    ai[j] = ai[j + 1];
                    ai[j + 1] = aa;
                    bb = bi[j];
                    bi[j] = bi[j + 1];
                    bi[j + 1] = bb;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (k == true) {
                    if ((ai[i] + bi[i]) >= 0 || (ai[j + 1] + bi[j + 1]) >= 0) {
                        if ((ai[i] + ai[j + 1] >= 0) && (bi[i] + bi[j + 1] >= 0)) {
                            aa = ai[i] + ai[j + 1];
                            bb = bi[i] + bi[j + 1];
                            max = aa + bb;
                            ai[i] = 0;
                            ai[j + 1] = 0;
                            bi[i] = 0;
                            bi[j + 1] = 0;
                            k = false;
                        }
                    }
                } else if ((ai[j + 1] + bi[j + 1]) >= 0) {
                    if ((ai[j + 1] + aa >= 0) && bi[j + 1] + bb >= 0) {
                        aa += ai[j + 1];
                        bb += bi[j + 1];
                        max += ai[j + 1] + bi[j + 1];
                        ai[j + 1] = 0;
                        bi[j + 1] = 0;
                    }
                }
            }
        }
        System.out.print(max);
    }

}
