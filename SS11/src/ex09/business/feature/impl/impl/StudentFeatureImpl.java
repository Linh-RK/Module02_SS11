package ex09.business.feature.impl.impl;

import ex09.business.entity.Student;
import ex09.business.feature.impl.IStudentFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentFeatureImpl implements IStudentFeature {
    //them sua xoa sort
    public static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Linh",8));
        students.add(new Student(2,"Huong",9));
        students.add(new Student(3,"Hung",7));
        students.add(new Student(4,"Minh",6));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int deleteId) {
        //xoa theo object tra ve Student
    students.remove(findStudentByID(deleteId));
    }

    @Override
    public Student findStudentByID(int id) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getStudentId() == id)
                return students.get(i);
        }
        return null;
    }

    @Override
    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageStore();
        }
        return sum / students.size();
    }

    @Override
    public void sortStudentsByScore() {
    students.sort(Comparator.comparingDouble(Student::getAverageStore));
//    students.sort(Comparator.comparingDouble(Student::getAverageStore).reversed());
    }

    @Override
    public String toString() {
        return "StudentFeatureImpl{}";
    }
}
