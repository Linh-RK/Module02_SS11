package ex09.business.feature.impl;

import ex09.business.entity.Student;

public interface IStudentFeature {
    void addStudent(Student student);
    void removeStudent(int deleteId);
    Student findStudentByID(int id);
    double getAverageScore();
    void sortStudentsByScore();
}
