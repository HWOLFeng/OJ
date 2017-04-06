package day12;

/**
 * Created by HWOLF on 2017/4/3.
 */
/*
��������
����"������
����������
������������С˾��
��������С˾��
������Ϊ�������æ
��������æ"
�������Ƕ��衰���ֵ�С˾��������˵���ڵ�˾�����к��Ĳ��У���Ҫ�������ܡ��������ǳ��أ���Ҫ�����ػ����ֵ����ر����ڵ�ǰ�ͼ����������ʱ��
˾����������Ϊɢ��������ס���ۡ�ɳʯ������......
��������֪����������������Ϊw���ɹ�ѡ�����Ʒ������n��ÿ����Ʒ������Ϊgi,��ֵΪpi����������װ�ص�����ֵ����n<10000,w<10000,0<gi<=100,0<=pi<=100)
�����ʽ
���������һ��Ϊ�ɿո�ֿ�����������n w
�����ڶ��е���n+1�У�ÿ���������������ɿո�ֿ����ֱ��ʾgi��pi
�����ʽ
��������ֵ������һλС����
��������
    5 36
    99 87
    68 36
    79 43
    75 94
    7 35
�������
71.3
���ͣ�
��װ��5����Ʒ���ü�ֵ35��ռ������7
��װ��4����Ʒ���ü�ֵ36.346,ռ������29
�����һλС������71.3
 */

import java.util.*;
import java.io.*;

class Node implements Comparable<Node> {
    double g;
    double p;

    public Node(double g, double p) {
        this.g = g;
        this.p = p;
    }

    public int compareTo(Node n) {
        double a = this.p / this.g;
        double b = n.p / n.g;
        if (a < b) return 1;
        else return -1;
    }
}

public class Taxi {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PriorityQueue<Node> q = new PriorityQueue<>();
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        double w = st.nval;
        double a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            st.nextToken();
            a = st.nval;
            st.nextToken();
            b = st.nval;
            q.add(new Node(a, b));
        }
		while(!q.isEmpty()){
			System.out.println(q.poll().g);
		}

        int k = 1;
        double sum = 0;
        while (w > 0) {
            Node tmp = q.poll();

            if (w >= tmp.g) {
                sum += tmp.p;
            } else {
                sum += tmp.p / tmp.g * w;
            }
            w = w - tmp.g;
            k++;
            if (k == n + 1) break;
        }

        System.out.printf("%.1f\n", sum);
    }
}

