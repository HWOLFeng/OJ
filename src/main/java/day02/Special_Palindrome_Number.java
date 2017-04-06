package day02;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/14.
 */
public class Special_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int count = 0;
        if(n<=54&&n>=1){
            if(n%2==0){
                for(int i = 100;i<=999;i++){
                    int t = 0;
                    str = String.valueOf(i);
                    for(int j=2;j>=0;j--){
                        str = str +str.charAt(j);
                    }
                    char[] c = str.toCharArray();
                    for (int m = 0;m < c.length;m++){
                        t += Integer.parseInt(String.valueOf(c[m]));
                    }
                    if (t == n){
                        System.out.println(str);
                        count++;
                    }

                }
                System.out.print(count);
            }else {
                for(int i = 10;i<=99;i++){
                    for(int z = 0;z<=9;z++){
                        int t = 0;
                        str = String.valueOf(i);
                        str = str+String.valueOf(z)+str.charAt(1)+str.charAt(0);
                        char[] c = str.toCharArray();
                        for (int m = 0;m < c.length;m++){
                            t += Integer.parseInt(String.valueOf(c[m]));
                        }
                        if (t == n){
                            System.out.println(str);
                        }
                    }
                }
            }
        }
    }

}
