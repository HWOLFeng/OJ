package day08;

import java.util.Stack;

/**
 * Created by HWOLF on 2017/3/24.
 */
/*
做数电作业创建的
 */
public class baseConversion {
    public static void baseConversion(int i) {
        Stack stack = new Stack();
        while (i > 0) {
            stack.push(i % 8);
            i = i / 8;
        }
        while (!stack.empty()) System.out.print(stack.pop());
    }

    public static void main(String[] args) {
        baseConversion(9);
    }
}
