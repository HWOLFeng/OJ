package day11;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by HWOLF on 2017/4/6.
 */
public class QS {
    public static void Quick(int[]a,int start,int end){
        if (start<end){
            int i = start;
            int key = a[start];
            if (i<end){
                for (int j = start+1; j <= end; j++) {
                    if (a[j]<key){
                        int temp = a[i+1];
                        a[i+1] = a[j];
                        a[j] = temp;
                        i++;
                    }
                }
                a[start] = a[i];
                a[i] = key;
                Quick(a,start,i-1);
                Quick(a,i+1,end);
            }
        }

    }

    public static void main(String[] args) {
        int[]a ={2,5,415,12,3,45,48,784,651,23};
        Quick(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
}
