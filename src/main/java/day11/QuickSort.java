package day11;

import java.util.ArrayList;

/**
 * Created by HWOLF on 2017/4/2.
 */
public class QuickSort {

    private static void QuickSort(int[] array, int start, int end) {
        if (start < end) {
            int key = array[start];//初始化保存基元
            int j ;
            int i = start;//初始化i,j
            for (j = start + 1; j <= end; j++) {
                if (array[j] < key)//如果此处元素小于基元，则把此元素和i+1处元素交换，并将i加1，如大于或等于基元则继续循环
                {
                    int temp = array[j];
                    array[j] = array[i + 1];
                    array[i + 1] = temp;
                    i++;
                }

            }
            array[start] = array[i];//交换i处元素和基元
            array[i] = key;
            QuickSort(array, start, i - 1);//递归调用
            QuickSort(array, i + 1, end);//从下一个数开始重复操作

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
