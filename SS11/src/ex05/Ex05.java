package ex05;

import java.util.ArrayList;

public class Ex05 {
    public static void main(String[] args) {
//        B1: Tạo 1 list số nguyên,
//        B2: Thêm phần tử vào list
//        B3: Tạo list số nguyên mới để lưu những số nguyên không chia hết cho 2
//        B4: Duyệt list đó và gán những số thỏa mãn điều kiện vào list mới.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(16);
        list.add(31);
        list.add(562);
        list.add(123);
        list.add(25);
        System.out.println(list);
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddList.add(list.get(i));
            }
        }
        System.out.println(oddList);
    }
}
