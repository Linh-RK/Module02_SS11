package ex08.demoSet;

import ex08.demoList.Student;

import java.util.HashSet;
import java.util.Set;

public class SetVoiObj {
    public static void main(String[] args) {
        Set<Student> list = new HashSet<>();
        list.add(new Student(1,"linh","Java"));
        list.add(new Student(1,"huong","Java"));
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
