package day09;

import java.util.Stack;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*

���ľ

С�����ϲ�������ֻ�ľ��
һ����10���ľ��ÿ����ľ����һ�����֣�0~9��

���ľ����
ÿ����ľ�ŵ�����������ľ�����棬����һ���������������ľ����С��
�����4��Ľ������Σ������������еĻ�ľ��

���������ֺϸ�Ĵ��

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4

������������Ĵһ���ж����֣�

�����ʾ����Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�

 */
public class Building_blocks {
    static int count = 0;

    public static void main(String[] args) {
        int[] a = new int[10];
        boolean[] visit = new boolean[10];
        dfs(0, visit, a);
        System.out.println(count);
    }

    public static void dfs(int num, boolean[] visit, int[] a) {
        if (num == 10) {
            if (visit(a)) {
                count++;
            }
            return;
        }
        for (a[num] = 0; a[num] < 10; a[num]++) {
            if (!visit[a[num]]) {
                visit[a[num]] = true;
                dfs(num+1, visit, a);
                num = num - 1;
                visit[a[num]] = false;
            } else {
                continue;
            }
        }
    }

    private static boolean visit(int[] a) {
        if (a[0] < a[1] && a[0] < a[2] && a[1] < a[3] && a[1] < a[4]
                && a[2] < a[4] && a[2] < a[5] && a[3] < a[6] && a[3] < a[7]
                && a[4] < a[7] && a[4] < a[8] && a[5] < a[8] && a[5] < a[9]) {
            return true;
        } else {
            return false;
        }
    }
}
