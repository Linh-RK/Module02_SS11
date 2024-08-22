package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
//        Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra từ có độ dài ngắn nhất trong câu
//        Hướng dẫn:
//        B1: Tạo sẵn 1 chuỗi là một câu hoặc một đoạn văn.
//        B2: Convert từng từ trong chuỗi đó thành các phần tử trong list.
//        B3: Tạo thêm một newList để lưu trữ những phần tử ngắn nhất được tìm thấy trong trường hợp có nhiều từ ngắn nhất có độ dài bằng nhau.
//        B4: Duyệt newList để in ra kết quả những từ có độ dài ngắn nhất.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ki");
        String string= sc.nextLine();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(string.split(" ")));
        System.out.println(list);
        ArrayList<String> newList = new ArrayList<>();
        int minLength = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()<minLength) {
                minLength = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == minLength) {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }


    }
}
