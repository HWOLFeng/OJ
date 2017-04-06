package day01;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/2/9.
 * circle space
 */
public class circle_space {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double Pi = 3.14159265358979323;
        double a = Pi * r * r;
        String str = String.format("%.7f", a);
        System.out.println(str);
    }
}
