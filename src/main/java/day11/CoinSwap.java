package day11;

/**
 * Created by HWOLF on 2017/4/2.
 */
import java.io.*;
/*
问题描述
小明这些天一直在思考这样一个奇怪而有趣的问题：

在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：

如果区间[L, R] 里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。

当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。

输入格式
第一行是一个正整数N (1 <= N <= 50000), 表示全排列的规模。

第二行是N个不同的数字Pi(1 <= Pi <= N)， 表示这N个数字的某一全排列。

输出格式
输出一个整数，表示不同连号区间的数目。

样例输入1
4
3 2 4 1
样例输出1
7
样例输入2
5
3 4 2 5 1
样例输出2
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

