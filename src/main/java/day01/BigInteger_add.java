package day01;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by HWOLF on 2017/2/9.
 */
/*
��������
��1+2+3+...+n��ֵ��
�����ʽ
�������һ������n��
�����ʽ
���һ�У�����һ����������ʾ1+2+3+...+n��ֵ��
��������
4
�������
10
��������
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
