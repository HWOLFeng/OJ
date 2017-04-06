package day11;

import java.util.ArrayList;

/**
 * Created by HWOLF on 2017/4/2.
 */
public class QuickSort {

    private static void QuickSort(int[] array, int start, int end) {
        if (start < end) {
            int key = array[start];//��ʼ�������Ԫ
            int j ;
            int i = start;//��ʼ��i,j
            for (j = start + 1; j <= end; j++) {
                if (array[j] < key)//����˴�Ԫ��С�ڻ�Ԫ����Ѵ�Ԫ�غ�i+1��Ԫ�ؽ���������i��1������ڻ���ڻ�Ԫ�����ѭ��
                {
                    int temp = array[j];
                    array[j] = array[i + 1];
                    array[i + 1] = temp;
                    i++;
                }

            }
            array[start] = array[i];//����i��Ԫ�غͻ�Ԫ
            array[i] = key;
            QuickSort(array, start, i - 1);//�ݹ����
            QuickSort(array, i + 1, end);//����һ������ʼ�ظ�����

        }

    }

    public static void main(String[] args) {
        int[] array = {6,5,4,3,2,1};
        QuickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
