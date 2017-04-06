package day01;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by HWOLF on 2017/2/9.
 */
/*
问题描述
求1+2+3+...+n的值。
输入格式
输入包括一个整数n。
输出格式
输出一行，包括一个整数，表示1+2+3+...+n的值。
样例输入
4
样例输出
10
样例输入
100
 */
public class BigInteger_add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = n.add(BigInteger.ONE).multiply(n).divide(BigInteger.valueOf(2));
        System.out.println(m);
    }
}
