package day01;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by HWOLF on 2017/2/9.
 */
/*
��������
����һ����ݣ��ж���һ���ǲ������ꡣ

���������֮һ����ʱ����һ�������꣺

1. �����4�ı���������100�ı�����

2. �����400�ı�����

��������ݶ��������ꡣ

�����ʽ
�������һ������y����ʾ��ǰ����ݡ�
�����ʽ
���һ�У������������������꣬�����yes���������no��
˵����������ָ�������һ���ַ�����Ϊ��������籾���yes����no������Ҫ�ϸ��������и����Ĵ�Сд��д���Сд�����÷֡�
 */
public class years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
            System.out.println("yes");
        else System.out.println("no");
    }
}
