package day12;

/**
 * Created by HWOLF on 2017/4/3.
 */


import java.util.Scanner;
/*
�������СB����N���ǣ�������������СBֱ�ӳԵ���
�������赱ǰ��M���ǣ�СBÿ�ο�����P���ǣ�����P��M��һ�������ڸ�����M������������ʱ������ͻ���СB����P�����Ժ��ٴ��Ƕ�������P���ǡ�Ȼ��СB�Ϳ��Խ������ǡ�
��������СBϣ��֪���������ö����ǡ�
�����ʽ
����һ������N
�����ʽ
�����������ö�����
��������
15
�������
6
���ݹ�ģ��Լ��
����N <= 100000
 */


public class TakeCandy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n / 2);
        else
            System.out.println(n / 2 - 1);
    }
}


