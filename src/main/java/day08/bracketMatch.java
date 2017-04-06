package day08;

import java.util.Stack;

/**
 * Created by HWOLF on 2017/3/24.
 */
public class bracketMatch {
    public static boolean bracketMatch(String s){
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case '{':
                case '(':
                case '[':
                case '<':
                    stack.push(Integer.valueOf(c));break;
                case '}':if (!stack.empty()&&((Integer)stack.pop()).intValue() == '{')break;
                else return false;
                case ')':if (!stack.empty()&&((Integer)stack.pop()).intValue() == '(')break;
                else return false;
                case ']':if (!stack.empty()&&((Integer)stack.pop()).intValue() == '[')break;
                else return false;
                case '>':if (!stack.empty()&&((Integer)stack.pop()).intValue() == '<')break;
                else return false;
            }
        }
        if (stack.empty())return true;
        else return false;
    }

    public static void main(String[] args) {
        if (bracketMatch("{([<>])}")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
