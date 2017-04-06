//package day10;
//
//import java.util.Scanner;
//
///**
// * Created by HWOLF on 2017/4/4.
// */
//public class K_and_Q {
//    public static int[][] queen;
//    public static int count = 0;
//    public static int[] colunm;
//    public static int x, y;
//
//    public static void search(int cur, int n) {
//        if (cur == n) count++;
//        else {
//            for (int i = 0; i < n; i++) {
//                boolean flag = true;
//                if (queen[cur][i] == 1)continue;
//                colunm[cur] = i;
//                for (int j = 0; j < cur; j++) {
//                    if (colunm[cur] == colunm[j] ||
//                            cur - colunm[cur] == j - colunm[j]||
//                            cur + colunm[cur] == j + colunm[j]){
//                        flag = false;
//                        break;
//                    }
//                }
//                if (flag)search(cur+1,n);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        int k, m;
//        queen = new int[n][n];
//        colunm = new int[n];
//        k = x - 2 > 0 ? x - 2 : 0;
//        m = y - 2 > 0 ? y - 2 : 0;
//        x = x > n - 1 ? n - 1 : x;
//        y = y > n - 1 ? n - 1 : y;
//        for (int i = k; i <= x; i++) {
//            for (int j = m; j <= y; j++) {
//                queen[i][j] = 1;
//            }
//        }
//        search(0, n);
//        System.out.println(count);
//    }
//}
