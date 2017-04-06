package day02;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/14.
 */
/*
生成一个n长，m个字母的矩阵
5
5
ABCDE
BABCD
CBABC
DCBAB
EDCBA
 */
public class Letter_Graphics {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 25;i>=0;i--){
            str = str + (char)((int)'A'+i);
        }
        for(int i = 1;i<26;i++){
            str = str +(char)((int)'A'+i);
        }
        for(int i =0;i<n;i++){
            String tmp = str.substring(25-i,25-i+m);//26-1
            System.out.println(tmp);
        }
    }
}
