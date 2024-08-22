package ex01;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Collections {
    public static void main(String[] args) {

        Random rd =  new Random();
        int arrSize= rd.nextInt(9)+1;
        ArrayList<Integer> arr = new ArrayList<Integer>(arrSize);
        for(int i = 0; i < arrSize; i++){
            int element = rd.nextInt(100);
            arr.add(element);
        }
        System.out.println("Mang ban dau:");
        System.out.println(arr);
        System.out.println("Max cua mang:");
        System.out.println(java.util.Collections.max(arr));
        System.out.println("Mang sau khi dao");
        System.out.println(arr.reversed());
        System.out.println("Mang sau khi sap xep");
        java.util.Collections.sort(arr);
        System.out.println(arr);


    }


}
