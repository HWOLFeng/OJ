package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
public class Building_blocks03 {
    static boolean[] visit = new boolean[10];
    static int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int count = 0;

    public static void main(String[] args) {
        dfs(0);
        System.out.println(count);
    }

    public static boolean condition(int n) {
        if (n == 2) {
            if (a[0] < a[1] && a[0] < a[2]) {
                return true;
            } else return false;
        } else if (n == 5) {
            if (a[1] < a[3] && a[1] < a[4] && a[2] < a[4] && a[2] < a[5]) {
                return true;
            } else return false;
        } else if (n == 9) {
            if (a[3] < a[6] && a[3] < a[7] && a[4] < a[7] && a[4] < a[8] && a[5] < a[8] && a[5] < a[9]) {
                count++;
                return true;
            } else return false;
        } else return true;

    }

    public static void dfs(int n) {
        int i;
        for (i = 0; i < 10; i++) {
            if (!visit[i]) {
                a[n] = i;
                visit[i] = true;//表示这个数字已经使用过了
                if (condition(n)) {
                    dfs(n + 1);
                }
                visit[i] = false;
            } else continue;
        }
    }
}
