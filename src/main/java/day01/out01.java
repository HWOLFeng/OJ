package day01;


/**
 * Created by HWOLF on 2017/2/9.
 */
/*
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：

00000

00001

00010

00011

00100

请按从小到大的顺序输出这32种01串。

输入格式
本试题没有输入。
输出格式
输出32行，按从小到大的顺序每行一个长度为5的01串。
样例输出
00000
00001
00010
00011
<以下部分省略>
 */
public class out01 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            System.out.print(i % 32 / 16);
            System.out.print(i % 16 / 8);
            System.out.print(i % 8 / 4);
            System.out.print(i % 4 / 2);
            System.out.println(i % 2);
        }
    }
}
