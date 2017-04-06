package day13;

/**
 * Created by HWOLF on 2017/4/5.
 */
/*
��������
����ѧ�������˴�ҵ���ҵ���೤Ϊ�˰�ͬѧ���һ���ҵ������ȥ��ѧ�Ծ�������ѧ��Ϊ�˲�Ҫ���˴��ţ�ס��һ���Ǳ��
�Ǳ�������һ����ά�ĸ����Թ���Ҫ���Ǳ��������ͨ���Թ�����Ϊ�೤��������Ҫ�㣬ĥ�����󿳲񹦣���Ϊ�˽�Լʱ�䣬
����������㵽���Թ��ĵ�ͼ��׼����ǰ������̵�·�ߡ������������������ӽ���������飬���Ǿ�ί���������һ����̵�·�ߡ�
�����ʽ
������һ����������n�� m��Ϊ�Թ��ĳ���
����������n�У�ÿ��m��������֮��û�м����Ϊ0��1�е�һ����0��ʾ������ӿ���ͨ����1��ʾ�����ԡ�
�����������Ѿ����Թ�����(1,1)�ĵط��������Ͻǣ��Թ��ĳ�����(n,m)��ÿ���ƶ�ʱֻ������������4�������ƶ�������һ������ͨ���ĸ����ÿ���ƶ���һ�������ݱ�֤(1,1)��(n,m)����ͨ����
�����ʽ
������һ��һ����Ϊ��Ҫ�����ٲ���K��
�����ڶ���K���ַ���ÿ���ַ���{U,D,L,R},�ֱ��ʾ�������ҡ�����ж���������ͬ�����·����
ѡ���ڴ˱�ʾ�������ֵ�����С��һ����
��������
Input Sample 1:
3 3
001
100
110

Input Sample 2:
3 3
000
000
000
�������
Output Sample 1:
4
RDRD

Output Sample 2:
4
DDRR
���ݹ�ģ��Լ��
������20%���������㣺1<=n,m<=10
������50%���������㣺1<=n,m<=50
������100%���������㣺1<=n,m<=500��
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Student_Maxen {
    static char a[][];
    static String line = "Z";
    static int minStep;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s2[] = br.readLine().split(" ");
        int n = Integer.parseInt(s2[0]);
        int m = Integer.parseInt(s2[1]);
        minStep = n * m;
        a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = br.readLine().toCharArray();
        }
        LinkedList<Node> list = new LinkedList<>();
        boolean b[][] = new boolean[n][m];
        list.add(new Node(0, 0, 0, null, '.'));
        b[0][0] = true;
        while (!list.isEmpty()) {
            Node temp = list.removeFirst();
            int x = temp.x;
            int y = temp.y;
            int step = temp.step;

            if (x == n - 1 && y == m - 1) {
                if (step < minStep) {
                    minStep = step;
                    StringBuilder sb = new StringBuilder();
                    char t = temp.cur;
                    while (t != '.') {
                        sb.insert(0, t);
                        temp = temp.pre;
                        t = temp.cur;
                    }
                    line = sb.toString();

                } else if (step == minStep) {

                    StringBuilder sb = new StringBuilder();
                    char t = temp.cur;
                    while (t != '.') {
                        sb.append(t);
                        temp = temp.pre;
                        t = temp.cur;
                    }
                    String tempLine = sb.toString();
                    if (tempLine.compareTo(line) < 0) {
                        line = tempLine;
                    }
                }

            }

            if (step == minStep)
                continue;

            if (x - 1 >= 0 && !b[x - 1][y] && a[x - 1][y] == '0') {
                list.add(new Node(x - 1, y, step + 1, temp, 'U'));
                b[x - 1][y] = true;
            }

            if (x + 1 < n && !b[x + 1][y] && a[x + 1][y] == '0') {
                list.add(new Node(x + 1, y, step + 1, temp, 'D'));
                b[x + 1][y] = true;
            }

            if (y - 1 >= 0 && !b[x][y - 1] && a[x][y - 1] == '0') {
                list.add(new Node(x, y - 1, step + 1, temp, 'L'));
                b[x][y - 1] = true;
            }

            if (y + 1 < m && !b[x][y + 1] && a[x][y + 1] == '0') {
                list.add(new Node(x, y + 1, step + 1, temp, 'R'));
                b[x][y + 1] = true;
            }
        }


        System.out.println(minStep);
        System.out.println(line);

    }
}

class Node {
    int step;
    Node pre;
    int x;
    int y;
    char cur;

    public Node(int x, int y, int step, Node pre, char cur) {
        super();
        this.step = step;
        this.pre = pre;
        this.x = x;
        this.y = y;
        this.cur = cur;

    }


}

