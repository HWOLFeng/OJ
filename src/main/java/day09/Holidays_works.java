package day09;

/**
 * Created by HWOLF on 2017/3/25.
 */
/*

������ҵ

����Сѧ����ѧ��ĿҲ������ô����ġ�
�������������ҵ��

   �� + �� = ��
   �� - �� = ��
   �� �� �� = ��
   �� �� �� = ��

ÿ���������1~13�е�ĳһ�����֣��������ظ���
���磺
 6  + 7 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5

�Լ���
 7  + 6 = 13
 9  - 8 = 1
 3  * 4 = 12
 10 / 2 = 5

�������ֽⷨ�����ӷ����˷������ɺ��㲻ͬ�ķ�����

��һ���ҵ��˶����ַ�����
1376
 */
public class Holidays_works {
    //    static int a[] = new int[13];
    static int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static boolean[] visited = new boolean[14];
    static int count = 0;

    public static void main(String[] args) {
        dfs(1);
        System.out.println(count);
    }

    public static boolean condition(int n) {
        if (n == 13) {
            if (a[1] + a[2] == a[3] &&
                    a[4] > a[5] &&
                    a[4] - a[5] == a[6] &&
                    a[7] > a[8] &&
                    a[7] / a[8] == a[9] &&
                    a[10] * a[11] == a[12]) {
                count++;
                return true;
            } else return false;
        } else return true;
    }

    public static void dfs(int n) {
        int i;
        for (i = 1; i <= 13; i++) {
            if (!visited[i]) {
                a[n] = i;
                visited[i] = true;
                if (condition(n)) dfs(n + 1);
                visited[i] = false;
            } else continue;
        }
    }
}
