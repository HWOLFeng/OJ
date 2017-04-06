package day13;

/**
 * Created by HWOLF on 2017/4/5.
 */
/*
问题描述
　　学霸抢走了大家的作业，班长为了帮同学们找回作业，决定去找学霸决斗。但学霸为了不要别人打扰，住在一个城堡里，
城堡外面是一个二维的格子迷宫，要进城堡必须得先通过迷宫。因为班长还有妹子要陪，磨刀不误砍柴功，他为了节约时间，
从线人那里搞到了迷宫的地图，准备提前计算最短的路线。可是他现在正向妹子解释这件事情，于是就委托你帮他找一条最短的路线。
输入格式
　　第一行两个整数n， m，为迷宫的长宽。
　　接下来n行，每行m个数，数之间没有间隔，为0或1中的一个。0表示这个格子可以通过，1表示不可以。
假设你现在已经在迷宫坐标(1,1)的地方，即左上角，迷宫的出口在(n,m)。每次移动时只能向上下左右4个方向移动到另外一个可以通过的格子里，每次移动算一步。数据保证(1,1)，(n,m)可以通过。
输出格式
　　第一行一个数为需要的最少步数K。
　　第二行K个字符，每个字符∈{U,D,L,R},分别表示上下左右。如果有多条长度相同的最短路径，
选择在此表示方法下字典序最小的一个。
样例输入
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
样例输出
Output Sample 1:
4
RDRD

Output Sample 2:
4
DDRR
数据规模和约定
　　有20%的数据满足：1<=n,m<=10
　　有50%的数据满足：1<=n,m<=50
　　有100%的数据满足：1<=n,m<=500。
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

