package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*
分小组

9名运动员参加比赛，需要分3组进行预赛。
有哪些分组的方案呢？

我们标记运动员为 A,B,C,... I
下面的程序列出了所有的分组方法。

此题为填空题
 */
public class Divide_Group {
    static int count = 0;

    public static String remain(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) s += (char) (i + 'A');
        }
        return s;
    }

    public static void f(String s, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) continue;
            a[i] = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == 1) continue;
                a[j] = 1;
                for (int k = j + 1; k < a.length; k++) {
                    if (a[k] == 1) continue;
                    a[k] = 1;
                    System.out.println(s + " " + (char) (i + 'A') + (char) (j + 'A') + (char) (k + 'A') + " " + remain(a));  //填空位置
                    count++;
                    a[k] = 0;
                }
                a[j] = 0;
            }
            a[i] = 0;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 1;

        for (int b = 1; b < a.length; b++) {
            a[b] = 1;
            for (int c = b + 1; c < a.length; c++) {
                a[c] = 1;
                String s = "A" + (char) (b + 'A') + (char) (c + 'A');
                f(s, a);
                a[c] = 0;
            }
            a[b] = 0;
        }
    }
}

