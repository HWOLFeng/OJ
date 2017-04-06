package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*
剪邮票

如【图1.jpg】, 有12张连在一起的12生肖的邮票。
现在你要从中剪下5张来，要求必须是连着的。
（仅仅连接一个角不算相连）

请你计算，一共有多少种不同的剪取方法。
答案116
 */
public class CutPaper_Five {
    static boolean[] visit = new boolean[5];
    static int[] stampTemp = new int[5];
    static int[] stamp = {1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14};
    static int[] diraction = {1, -1, 5, -5};
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < stamp.length; i++) {
            for (int j = i + 1; j < stamp.length; j++) {
                for (int k = j + 1; k < stamp.length; k++) {
                    for (int l = k + 1; l < stamp.length; l++) {
                        for (int m = l + 1; m < stamp.length; m++) {
                            stampTemp[0] = stamp[i];
                            stampTemp[1] = stamp[j];
                            stampTemp[2] = stamp[k];
                            stampTemp[3] = stamp[l];
                            stampTemp[4] = stamp[m];
                            for (int a = 0; a < 5; a++) visit[a] = false;
                            visit[0] = true;
                            dfs(0);
                            boolean flag = false;
                            for (int n = 0; n < 5; n++) {
                                if (!visit[n]) {
                                    flag = true;
                                    break;
                                }
                            }
                            if (flag) continue;
                            else count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }


    public static void dfs(int n) {
        for (int i = 0; i < 4; i++) {
            int temp = stampTemp[n] + diraction[i];
            if (temp < 1 || temp > 14 || temp == 5 || temp == 10) continue;
            for (int j = 0; j < 5; j++) {
                if (!visit[j] && temp == stampTemp[j]) {
                    visit[j] = true;
                    dfs(j);
                }
            }
        }
    }

}

