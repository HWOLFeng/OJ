package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by HWOLF on 2017/3/19.
 */
public class test2_hashset {
    public String colors[] = {"orange","tan","orange","white","gray"};
    public test2_hashset(){
        ArrayList list;
        list = new ArrayList(Arrays.asList(colors));
        System.out.println("ArrayList:"+list);
        System.out.println("HashSet:"+printNonDuplicates(list));
    }

    public HashSet printNonDuplicates(Collection collection) {
        //构造HashSet删除Collection 中多余的元素
        HashSet set = new HashSet(collection);
        //将collection 放入HashSet猴即会消除重复元素
        return set;
    }

    public static void main(String[] args) {
        test2_hashset t = new test2_hashset();
    }
}
