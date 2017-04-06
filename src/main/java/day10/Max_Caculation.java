//package day10;
//
//import java.util.Scanner;
//
///**
// * Created by HWOLF on 2017/3/29.
// */
//public class Max_Caculation {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int K = scanner.nextInt();
//        int A = N - K - 1;
//        int[] number = new int[N];
//        boolean[] used = new boolean[N];
//        for (int i = 0; i < N; i++) {
//            number[i] = scanner.nextInt();
//        }
//        while (A > 0) {
//            int i = 0;
//            if (!used[i] && number[i] == 1) {
//                used[i] = true;
//                if (number[i - 1] > number[i + 1]) {
//                    number[i] += number[i + 1];
//                    number[i + 1] = 1;
//                    used[i + 1] = true;
//                } else {
//                    number[i] += number[i - 1];
//                    number[i - 1] = 1;
//                    used[i - 1] = true;
//                }
//            }
//            if ()
//                A--;
//        }
//    }
//}
