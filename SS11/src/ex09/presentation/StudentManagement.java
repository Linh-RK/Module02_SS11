package ex09.presentation;

import ex09.business.entity.Student;
import ex09.business.feature.impl.IStudentFeature;
import ex09.business.feature.impl.impl.StudentFeatureImpl;

import java.util.Scanner;

public class StudentManagement {
     IStudentFeature studentFeature = new StudentFeatureImpl();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          StudentManagement studentManagement = new StudentManagement();
        int choice=0;
        do {
            System.out.println("------------------------MENU------------------------");
            System.out.println("            1. Show All Students                    ");
            System.out.println("            2. Add Student                          ");
            System.out.println("            3. Remove Student                       ");
            System.out.println("            4. Find Student By ID                   ");
            System.out.println("            5. Get Average Score                    ");
            System.out.println("            6. Sort Students by Score               ");
            System.out.println("            7. Exist                                ");
            System.out.println("----------------------------------------------------");
            System.out.println("Please enter your choice");

             choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    studentManagement.showAllStudent();
                    break;
                }
                case 2: {
                    studentManagement.addStudent(sc,studentManagement);
                    break;
                }
                case 3: {
                    studentManagement.removeStudent(sc);
                    break;
                }
                case 4: {
                    studentManagement.findStudent(sc);
                    break;
                }
                case 5: {
                    studentManagement.getAvgStudent();
                    break;
                }
                case 6: {
                    studentManagement.sortStudent();
                    break;
                }
                case 7: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.err.println("Please enter a choice from 1 to 7");
                    break;
                }
            }
        }while (true);
    }

    private void sortStudent() {
        studentFeature.sortStudentsByScore();
        for (Student s : StudentFeatureImpl.students){
            System.out.println(s);
        }
    }

    private void getAvgStudent() {
        System.out.println(studentFeature.getAverageScore());
    }

    private void findStudent(Scanner sc) {
        System.out.println("Enter student ID you want to find");
        int idFind = Integer.parseInt(sc.nextLine());
        Student result = studentFeature.findStudentByID(idFind);
        System.out.println(result);
    }

    private void removeStudent(Scanner sc) {
        System.out.println("Enter student ID you want to remove");
        int idDelete = Integer.parseInt(sc.nextLine());
        studentFeature.removeStudent(idDelete);
    }

    private void addStudent(Scanner sc, StudentManagement studentManagement) {
        System.out.println("Enter the number of student you want to add");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
        Student student = new Student();
        student.inputData(sc);
        studentFeature.addStudent(student);
        }
    }

    private void showAllStudent() {
        if(StudentFeatureImpl.students.isEmpty()){
            System.out.println("There are no students in the database");
            return;
        }
        for (Student student : StudentFeatureImpl.students) {
            System.out.println(student);
        }
    }
}

