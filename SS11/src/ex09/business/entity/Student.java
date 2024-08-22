package ex09.business.entity;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private double averageStore;
    public Student() {}

    public Student(int studentId, String studentName, double averageStore) {
        this.averageStore = averageStore;
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageStore() {
        return averageStore;
    }

    public void setAverageStore(double averageStore) {
        this.averageStore = averageStore;
    }
    public void inputData(Scanner scanner) {

        this.studentId = inputId(scanner);
        System.out.println("Student name: ");
        this.studentName = scanner.nextLine();
        System.out.println("Student Avg Score: ");
        this.averageStore = Integer.parseInt(scanner.nextLine());

    }

    private int inputId(Scanner scanner) {
        do {
            System.out.println("Student ID: ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
            }catch(Exception e) {
                System.err.println("ID must be a integer");
            }
        }while(true);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", averageStore=" + averageStore +
                '}';
    }
}
