package day11;

/**
 * Created by HWOLF on 2017/4/2.
 */
import java.io.*;
/*
��������
С����Щ��һֱ��˼������һ����ֶ���Ȥ�����⣺

��1~N��ĳ��ȫ�������ж��ٸ����������أ�������˵����������Ķ����ǣ�

�������[L, R] �������Ԫ�أ��������еĵ�L������R��Ԫ�أ�����������ܵõ�һ������ΪR-L+1�ġ����������У������������������䡣

��N��С��ʱ��С�����Ժܿ������𰸣����ǵ�N����ʱ������Ͳ�����ô���ˣ�����С����Ҫ��İ�����

�����ʽ
��һ����һ��������N (1 <= N <= 50000), ��ʾȫ���еĹ�ģ��

�ڶ�����N����ͬ������Pi(1 <= Pi <= N)�� ��ʾ��N�����ֵ�ĳһȫ���С�

�����ʽ
���һ����������ʾ��ͬ�����������Ŀ��

��������1
4
3 2 4 1
�������1
7
��������2
5
3 4 2 5 1
�������2
9
 */
public class CoinSwap{
    public static void main(String[] args)throws IOException {
        //long start=System.currentTimeMillis();
        fun();
        //System.out.println("\nTime:"+(System.currentTimeMillis()-start)+"ms");
    }
    public static void fun()throws IOException{
        //String filename="test.txt";
        //FileInputStream file=new FileInputStream(filename);
        //System.setIn(file);
        int[] a;
        StreamTokenizer st=new StreamTokenizer(new InputStreamReader(System.in));
        st.nextToken();
        int n=(int)st.nval;
        a=new int[n];
        for(int i=0;i<n;i++){
            st.nextToken();
            a[i]=(int)st.nval;
        }
        int min;
        int max;
        int num=0;
        for(int l=0;l<n;l++){
            min=max=a[l];
            for(int r=l;r<n;r++){
                if(a[r]<min)min=a[r];
                if(a[r]>max)max=a[r];
                //
                if(max-min==r-l)
                    num++;
            }
        }
        System.out.print(num);
    }

}

