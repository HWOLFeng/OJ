package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*

ú����Ŀ

��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
....
���һ����100�㣬���ж��ٸ�ú��

�����ʾú������Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�

�𰸣�5050
 */
public class TriangleAdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100; i++) {
            sum += initCount(i);
        }
        System.out.println(sum);
    }
    public static int initCount(int i){
        if (i == 1) {
            return 1;
        }else {
            return initCount(i-1)+i;
        }
    }
}
