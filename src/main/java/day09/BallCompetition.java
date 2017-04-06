//package day09;
//
//import java.util.Scanner;
//
///**
// * Created by HWOLF on 2017/3/26.
// */
///*
//
//取球博弈
//
//两个人玩取球的游戏。
//一共有N个球，每人轮流取球，每次可取集合{n1,n2,n3}中的任何一个数目。
//如果无法继续取球，则游戏结束。
//此时，持有奇数个球的一方获胜。
//如果两人都是奇数，则为平局。
//
//假设双方都采用最聪明的取法，
//第一个取球的人一定能赢吗？
//试编程解决这个问题。
//
//输入格式：
//第一行3个正整数n1 n2 n3，空格分开，表示每次可取的数目 (0<n1,n2,n3<100)
//第二行5个正整数x1 x2 ... x5，空格分开，表示5局的初始球数(0<xi<1000)
//
//输出格式：
//一行5个字符，空格分开。分别表示每局先取球的人能否获胜。
//能获胜则输出+，
//次之，如有办法逼平对手，输出0，
//无论如何都会输，则输出-
//
//例如，输入：
//1 2 3
//1 2 3 4 5
//
//程序应该输出：
//+ 0 + 0 -
//
//再例如，输入：
//1 4 5
//10 11 12 13 15
//
//程序应该输出：
//0 - 0 + +
//
//再例如，输入：
//2 3 5
//7 8 9 10 11
//
//程序应该输出：
//+ 0 0 0 0
//
//资源约定：
//峰值内存消耗（含虚拟机） < 256M
//CPU消耗  < 3000ms
//
// */
//public class BallCompetition {
//    public static int[] n = new int[3];
//    public static int[] x = new int[5];
//    public static int[] win = {-1, 0, 0, 1};
//    public static int[] s = new int[1000];
//
//    public static void main(String[] args) {
//        init();
//        int min = Math.min(n[0], Math.min(n[1], n[2]));
//        for (int i = 0; i < x.length; i++) {
//            int temp =
//        }
//    }
//
//    public static void init() {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < n.length; i++) {
//            n[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < x.length; i++) {
//            x[i] = scanner.nextInt();
//        }
//    }
//
//    static boolean isOdd(int num) {
//        if (num % 2 == 0) return true;
//        else return false;
//
//    }
//}
