package day02;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/14.
 */
public class Special_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for (int i = 100;i<=999;i++) {
            int tem = i;
            int ans =0;
            while (tem>0){
                int a = tem%10;
                ans = ans + a*a*a;
                tem=tem/10;
            }
            if(ans == i){System.out.println(i);}
        }
    }
}
