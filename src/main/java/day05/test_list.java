package day05;


import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by HWOLF on 2017/3/18.
 */
public class test_list {
    public String colors[] = {"red", "blue", "pink"};

    public test_list() {
        ArrayList list = new ArrayList();
        list.add(Color.magenta);
        for (int i = 0; i < colors.length; i++) {
            list.add(colors[i]);
        }
        list.add(Color.cyan);
        System.out.println("ArrayList");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        removeString(list);
        System.out.println("\nAfter removeString:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    public void removeString(Collection list) {
        Iterator iterator = list.iterator();
        //用iterator的hasNext 方法判断Collection是否还含有元素
        while (iterator.hasNext()) {
            if (iterator.next() instanceof String) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        new test_list();
    }

}
