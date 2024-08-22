package ex08.demoList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.*;

public class ArrayListStudent<S> {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
       List<Integer> list2 = new ArrayList<Integer>(List.of(2,5,7,8,9,10));
       List<Integer> list3 = List.of(2,5,7,8,9,10);
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
       for(Integer i : list){
           System.out.println(i);
       }
//       Interator<Integer> interator = list.interator();
//       while(interator.hasNext()){
//           System.out.println(interator.next());
//       }

        list.stream().forEach(e -> System.out.println(e));

    }
}
