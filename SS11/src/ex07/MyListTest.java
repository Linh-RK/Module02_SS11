package ex07;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();

        list1.add(10);
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println();

        list1.add(20);
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println();

        list1.add(0, 30);
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println();

        list1.remove(0);
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println();

        list1.clear();
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println();
    }

}
