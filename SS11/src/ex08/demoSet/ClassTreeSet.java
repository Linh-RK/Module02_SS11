package ex08.demoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClassTreeSet {
    public static void main(String[] args) {
        Set<String> list = new TreeSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
