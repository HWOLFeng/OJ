package day01;


/**
 * Created by HWOLF on 2017/2/9.
 */
/*
���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�

00000

00001

00010

00011

00100

�밴��С�����˳�������32��01����

�����ʽ
������û�����롣
�����ʽ
���32�У�����С�����˳��ÿ��һ������Ϊ5��01����
�������
00000
00001
00010
00011
<���²���ʡ��>
 */
public class out01 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            System.out.print(i % 32 / 16);
            System.out.print(i % 16 / 8);
            System.out.print(i % 8 / 4);
            System.out.print(i % 4 / 2);
            System.out.println(i % 2);
        }
    }
}
