package day12;

/**
 * Created by HWOLF on 2017/4/3.
 */


import java.util.Scanner;
/*
　妈妈给小B买了N块糖！但是她不允许小B直接吃掉。
　　假设当前有M块糖，小B每次可以拿P块糖，其中P是M的一个不大于根号下M的质因数。这时，妈妈就会在小B拿了P块糖以后再从糖堆里拿走P块糖。然后小B就可以接着拿糖。
　　现在小B希望知道最多可以拿多少糖。
输入格式
　　一个整数N
输出格式
　　最多可以拿多少糖
样例输入
15
样例输出
6
数据规模和约定
　　N <= 100000
 */


public class TakeCandy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n / 2);
        else
            System.out.println(n / 2 - 1);
    }
}


