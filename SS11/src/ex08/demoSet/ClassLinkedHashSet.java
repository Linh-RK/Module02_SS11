package ex08.demoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassLinkedHashSet {
    public static void main(String[] args) {
        Set<String> list = new LinkedHashSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
