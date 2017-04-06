package day02;

/**
 * Created by HWOLF on 2017/3/14.
 */
/*
输出4位所有的回文数
 */
public class Palindrome_number {

    public static void main(String[] args) {
        for(int i = 10;i<=99;i++){
            String str = String.valueOf(i);
            for(int j = 1;j>=0;j--){
                str = str + str.charAt(j);
            }
            System.out.println(str);
        }
    }
}
