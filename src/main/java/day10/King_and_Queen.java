package day10;

/**
 * Created by HWOLF on 2017/3/29.
 */

import java.util.Scanner;

public class King_and_Queen {
    public static int n;
    public static int x;
    public static int y;
    public static int cnt = 0;
    public static int[] column;
    public static int[][] queen;


    public static void search(int cur) {//��ʾ��
        if (cur == n) cnt++;//������������+
        else {
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                if (queen[cur][i] == 1) continue;//���Ѿ����ʹ�
                column[cur] = i;//��ʾ���ڵ�cur�У���i����
                for (int j = 0; j < cur; j++) {
                    if (column[cur] == column[j] ||
                            cur - column[cur] == j - column[j] ||//����һ���Խ�����,�������������ʾ��һ���ϣ�����flag=false
                            cur + column[cur] == j + column[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    search(cur + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        column = new int[n];
        queen = new int[n][n];
        //�ж��Ƿ�����ߵı߽�֮�ڣ���������߽磬��Ϊ��Ч��ȡ0ֵ��ʼ
        int k = x - 2 > 0 ? x - 2 : 0;
        int m = y - 2 > 0 ? y - 2 : 0;
        //ͬ��
        x = x > n - 1 ? n - 1 : x;
        y = y > n - 1 ? n - 1 : y;
        for (int i = k; i <= x; i++) {
            for (int j = m; j <= y; j++) {
                queen[i][j] = 1;
            }
        }
        search(0);
        System.out.println(cnt);
    }
}

