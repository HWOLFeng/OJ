//package day09;
//
//import java.util.Scanner;
//
///**
// * Created by HWOLF on 2017/3/26.
// */
///*
//
//ȡ����
//
//��������ȡ�����Ϸ��
//һ����N����ÿ������ȡ��ÿ�ο�ȡ����{n1,n2,n3}�е��κ�һ����Ŀ��
//����޷�����ȡ������Ϸ������
//��ʱ���������������һ����ʤ��
//������˶�����������Ϊƽ�֡�
//
//����˫���������������ȡ����
//��һ��ȡ�����һ����Ӯ��
//�Ա�̽��������⡣
//
//�����ʽ��
//��һ��3��������n1 n2 n3���ո�ֿ�����ʾÿ�ο�ȡ����Ŀ (0<n1,n2,n3<100)
//�ڶ���5��������x1 x2 ... x5���ո�ֿ�����ʾ5�ֵĳ�ʼ����(0<xi<1000)
//
//�����ʽ��
//һ��5���ַ����ո�ֿ����ֱ��ʾÿ����ȡ������ܷ��ʤ��
//�ܻ�ʤ�����+��
//��֮�����а취��ƽ���֣����0��
//������ζ����䣬�����-
//
//���磬���룺
//1 2 3
//1 2 3 4 5
//
//����Ӧ�������
//+ 0 + 0 -
//
//�����磬���룺
//1 4 5
//10 11 12 13 15
//
//����Ӧ�������
//0 - 0 + +
//
//�����磬���룺
//2 3 5
//7 8 9 10 11
//
//����Ӧ�������
//+ 0 0 0 0
//
//��ԴԼ����
//��ֵ�ڴ����ģ���������� < 256M
//CPU����  < 3000ms
//
// */
//public class BallCompetition {
//    public static int[] n = new int[3];
//    public static int[] x = new int[5];
//    public static int[] win = {-1, 0, 0, 1};
//    public static int[] s = new int[1000];
//
//    public static void main(String[] args) {
//        init();
//        int min = Math.min(n[0], Math.min(n[1], n[2]));
//        for (int i = 0; i < x.length; i++) {
//            int temp =
//        }
//    }
//
//    public static void init() {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < n.length; i++) {
//            n[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < x.length; i++) {
//            x[i] = scanner.nextInt();
//        }
//    }
//
//    static boolean isOdd(int num) {
//        if (num % 2 == 0) return true;
//        else return false;
//
//    }
//}
