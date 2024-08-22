package ex08.demoList;

import java.util.Comparator;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> list= new java.util.ArrayList<>();
        list.add(new Student(1,"Linh","Java"));
        list.add(new Student(2,"Huong","Java"));
        list.add(new Student(3,"Hung","Java"));
        list.add(new Student(4,"Ngoc","Java"));
        list.add(new Student(5,"Minh","Java"));
        for (Student student : list) {
            System.out.println(student);
        }
        list.sort(Comparator.comparing(Student::getName));
        System.out.println("List sorted by name");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
