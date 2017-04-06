package day13;

/**
 * Created by HWOLF on 2017/4/5.
 */
/*
问题描述
　　在一条直线上有n堆石子，每堆有一定的数量，每次可以将两堆相邻的石子合并，合并后放在两堆的中间位置，合并的费用为两堆石子的总数。求把所有石子合并成一堆的最小花费。
输入格式
　　输入第一行包含一个整数n，表示石子的堆数。
　　接下来一行，包含n个整数，按顺序给出每堆石子的大小 。
输出格式
　　输出一个整数，表示合并的最小花费。
样例输入
5
1 2 3 4 5
样例输出
33
数据规模和约定
　　1<=n<=1000, 每堆石子至少1颗，最多10000颗。
 */


import java.util.*;


public class CollectRock extends ArrayList implements Comparator{
    //    static int n;
//    static int count[][], s[][];
//    static int value[], sum[];
//
//    static int min(int a, int b) {
//        if (a < b)
//            return a;
//        else
//            return b;
//    }
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner reader = new Scanner(System.in);
//        n = reader.nextInt();
//        value = new int[n];
//        sum = new int[n + 1];
//        s = new int[n][n];
//        for (int i = 0; i < n; i++)
//            value[i] = reader.nextInt();
//        sum[0] = 0;
//        for (int i = 1; i <= n; i++)
//            sum[i] = sum[i - 1] + value[i - 1];
//        count = new int[n][n];
//        for (int i = 0; i < n - 1; i++) {
//            count[i][i + 1] = value[i] + value[i + 1];
//            s[i][i + 1] = i;
//        }
//        for (int i = n - 3; i >= 0; i--) {
//            for (int j = i + 2; j < n; j++) {
//                count[i][j] = count[i][i] + count[i + 1][j];
//                s[i][j] = i;
//                for (int k = s[i][j - 1]; k <= s[i + 1][j]; k++) {
//                    if (k < j) {
//                        int ccount = count[i][k] + count[k + 1][j];
//                        if (ccount < count[i][j]) {
//                            s[i][j] = k;
//                            count[i][j] = ccount;
//                        }
//                    }
//                }
//                count[i][j] += sum[j + 1] - sum[i];
//            }
//        }
//        System.out.println(count[0][n - 1]);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> value = new ArrayList();
        int total = 0;
        for (int i = 0; i < n; i++) {
            value.add(scanner.nextInt());
        }
        while (value.size() > 1) {
            Integer sum;
            Collections.sort(value);
            sum = value.get(0) + value.get(1);
            value.set(0, sum);
            value.remove(1);
            total += sum;
        }
        System.out.println(total);
        System.out.println(value.contains(15));
        System.out.println(value.indexOf(15));//正向查找
        System.out.println(value.lastIndexOf(15));
    }
public int compare(Object o1,Object o2){
    int i1 = ((Integer)o1).intValue();
    int i2 = ((Integer)o2).intValue();
    if (i1>i2)return 1;
    else return -1;
    }
}
//class Sort implements Comparator {
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        int i1 = ((Integer) o1).intValue();
//        int i2 = ((Integer) o2).intValue();
//        if (i1 < i2) {
//            return -1;
//        } else if (i1 > i2) {
//            return 1;
//        }
//        return 0;
//    }
//}

