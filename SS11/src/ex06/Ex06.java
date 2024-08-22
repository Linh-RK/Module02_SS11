package ex06;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
//        1Tạo 1 list các số nguyên chứa các phần tử cho sẵn hoặc thêm mặc mặc định các phần tử.
//        2Tạo 1 list mới để chứa các phần tử không trùng lặp
//        3Duyệt list cũ sử dụng phương thức contains() để check trùng lặp nếu phần tử chưa tồn tại
//        trong list mới thì add phần tử đó vào list mới .
//        4In ra danh sách các phần tử trong list mới ta thu được 1 list mới chứa các phần tử không trùng lặp.
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,6,8,34,56,78,234,76,6,56));
        ArrayList<Integer> uniqueElement = new ArrayList<>();
        System.out.println("Original list: ");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (!uniqueElement.contains(list.get(i))) {
                uniqueElement.add(list.get(i));
            }
        }
        System.out.println("Unique element list:");
        System.out.println(uniqueElement);
    }
}
