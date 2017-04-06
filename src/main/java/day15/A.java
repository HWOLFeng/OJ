package day15;

/**
 * Created by HWOLF on 2017/4/6.
 */

class A {
    //a ��ʾ�����������ݣ������������2�Ĵ��ݣ�����λ�ò�Ϊ-1
    static void pick(int[] a) {
        int n = 1;
        while (n < a.length) n *= 2;
        int[] b = new int[2 * n - 1];
        for (int i = 0; i < n; i++) {
            if (i < a.length)
                b[n - 1 + i] = i;
            else
                b[n - 1 + i] = -1;
        }
        //�����һ����ǰ����
        for (int i = b.length - 1; i > 0; i -= 2) {
            if (b[i] < 0) {
                if (b[i - 1] >= 0)
                    b[(i - 1) / 2] = b[i - 1];
                else
                    b[(i - 1) / 2] = -1;
            } else {
                if (a[b[i]] > a[b[i - 1]])
                    b[(i - 1) / 2] = b[i];
                else
                    b[(i - 1) / 2] = b[i - 1];
            }
        }
        //�������
        System.out.println(b[0] + ": " + a[b[0]]);
        //ֵ���ڸ�Ԫ�ص�λ����Ҫ����pk
        pk(a, b, 0, b[0]);
        //�ٴ��������
        System.out.println(b[0] + ": " + a[b[0]]);
    }

    // a ��ʾ���������ݣ�b ��������k ��ǰҪ���±�ƴ��λ�ã�v �Ѿ���ʤ����ֵ
    static void pk(int[] a, int[] b, int k, int v) {

        int k1 = k * 2 + 1;
        int k2 = k1 + 1;

        if (k1 >= b.length || k2 >= b.length) {
            b[k] = -1;
            return;
        }
        if (b[k1] == v)
            pk(a, b, k1, v);
        else
            pk(a, b, k2, v);
        //���±Ƚ�
        if (b[k1] < 0) {
            if (b[k2] >= 0)
                b[k] = b[k2];
            else
                b[k] = -1;
            return;
        }

        if (b[k2] < 0) {
            if (b[k1] >= 0)
                b[k] = b[k1];
            else
                b[k] = -1;
            return;
        }
        if (a[b[k1]]>a[b[k2]])  //���
            b[k] = b[k1];
        else
            b[k] = b[k2];
    }
}