package day01;

import java.util.Scanner;

/**
 * Created by huangshao on 2016/9/23.
 */
public class addnumber_longlong {
    public static void main(String[] args) {
        Integer b = 0;
        int j =0;
        int sum[] = new int[100];
        while (b>=-1 || b<100000){
            if(b == -1)break;
            else {
                int i;
                Scanner sc = new Scanner(System.in);
                b = sc.nextInt();
                for( i = 0; i < b; i++){
                    sum[i] = 0;
                }
                sum[i + 1] = 5;
                for( i = 0; i < b; i++){
                    sum[2*b+2-i-1] = 0;
                }
                sum[2*b-1]= 5;
                j++;continue;
            }
        }
            System.out.println(sum.toString());
    }
}
