package day03;

/**
 * Created by HWOLF on 2017/3/15.
 */
public class Lanqiao_Backdate {
    public static void main(String[] args) {
        int i = 1;
        int[] a = new int[10];
        a[i] = 1;
        while (true) {
            boolean flag = true;
            for (int k = i - 1; k >= 1; k--)
                if (a[i] == a[k]) {
                    flag = false;
                    break;
                }
            if (flag && i == 9 && a[1] < a[4]) {
                //����ʽ����flag������������û��ʹ�ù�
                //��λ��ʮλ����
                int m0 = a[2] * 10 + a[3];
                int m1 = a[5] * 10 + a[6];
                int m2 = a[8] * 10 + a[9];
                if (a[1] * m1 * m2 + a[4] * m0 * m2 == a[7] * m0 * m1) {
                    System.out.println(String.valueOf(a[1]) + "/" + String.valueOf(m0));
                    System.out.println(String.valueOf(a[4]) + "/" + String.valueOf(m1));
                    System.out.println(String.valueOf(a[7]) + "/" + String.valueOf(m2));
                    System.out.println();
                }
            }
            if (i < 9 && flag) {
                i++;
                a[i] = 1;//������һλ��a[i]���1
                continue;
            }
            while (a[i] == 9 && i > 1) i--;//���ĳ����+����9�����ǻ���û�����������ص�ǰһ����a[i]++
            if (a[i] == 9 && i == 1) break;//���������������
            else a[i]++;//
        }
    }
}
