package ex04;

import java.util.ArrayList;

public class Ex04 {
//    B1: Tạo 1 list số nguyên,
//    B2: Thêm phần tử vào list
//    B3: Sử dụng 1 trong 3 thuật toán sắp xếp (nổi bọt, chọn, chèn)
//    để sắp xếp các phần tử theo thứ tự tăng dần và in ra danh sách vừa sắp xếp.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(78);
        list.add(43);
        list.add(10);
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
