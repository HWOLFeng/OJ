package day10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/29.
 */
public class s01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue queue0 = new LinkedList();
        Queue queue1 = new LinkedList();
        String s = "";
        queue0.offer(0);

        for (int i = 0; i < n; i++) {
            while (!queue0.isEmpty()){
                if (queue0.poll() == 0){
                    queue1.offer(1);
                }else {
                    queue1.offer(0);
                    queue1.offer(1);
                }
            }

            while (!queue1.isEmpty()){
                queue0.offer(queue1.poll());
            }
            queue1.clear();
        }
        while (!queue0.isEmpty()){
            s+=queue0.poll();
        }
        System.out.println(s);
    }
}
