package presentation;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

     public void addStudent() {
        Student student = new Student();
        student.inputData(sc);
        students.add(student);
    
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.err.println("Chưa có sinh viên nào trong danh sách");
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

