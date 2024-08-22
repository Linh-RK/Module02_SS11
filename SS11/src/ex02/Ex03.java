package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
//        Viết chương trình để tạo một danh sách chứa các chuỗi từ một String cho sẵn
//        và in ra tất cả các chuỗi có độ dài lớn hơn 3 ký tự.
//        Hướng dẫn:
//        B1: Tạo chuỗi có giá trị là: “Rikkei Academy để nông dân biết code”
//        B2: Tạo 1 list có các pt kiểu String.
//        B3: Convert chuỗi ở bước 1 thành các phần tử trong mảng(Array) rồi gán vào list được tạo ở bước.
//        B4: Duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
        String string= "Rikkei Academy để nông dân biết code";
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(string.split(" ")));
        System.out.println(list);
        for (String str : list) {
            if (str.length()> 3) {
                System.out.print(str+" ");
            }
        }
    }
}
