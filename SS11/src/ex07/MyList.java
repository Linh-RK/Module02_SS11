package ex07;

public class MyList<E> {

    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if (size >= elements.length) {
            System.out.println("Danh sach day");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Chi so khong dung");

        }
    }}
//    E remove(int index) {

//    };
//    int size(){};
//    E clone(E element) {};
//    boolean contain() {E o};
//    int indexOf(E o) {E o};
//    boolean add(E element) {};
//    void ensureCapacity(int minCapacity) {};
//    E get(int i) {};
//    void clear();

//}
