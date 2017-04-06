package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*

寒假作业

现在小学的数学题目也不是那么好玩的。
看看这个寒假作业：

   □ + □ = □
   □ - □ = □
   □ × □ = □
   □ ÷ □ = □

每个方块代表1~13中的某一个数字，但不能重复。
比如：
 6  + 7 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5

以及：
 7  + 6 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5

就算两种解法。（加法，乘法交换律后算不同的方案）

你一共找到了多少种方案？
1376
 */
public class Holidays_works {
    //    static int a[] = new int[13];
    static int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static boolean[] visited = new boolean[14];
    static int count = 0;

    public static void main(String[] args) {
        dfs(1);
        System.out.println(count);
    }

    public static boolean condition(int n) {
        if (n == 13) {
            if (a[1] + a[2] == a[3] &&
                    a[4] > a[5] &&
                    a[4] - a[5] == a[6] &&
                    a[7] > a[8] &&
                    a[7] / a[8] == a[9] &&
                    a[10] * a[11] == a[12]) {
                count++;
                return true;
            } else return false;
        } else return true;
    }

    public static void dfs(int n) {
        int i;
        for (i = 1; i <= 13; i++) {
            if (!visited[i]) {
                a[n] = i;
                visited[i] = true;
                if (condition(n)) dfs(n + 1);
                visited[i] = false;
            } else continue;
        }
    }
}
