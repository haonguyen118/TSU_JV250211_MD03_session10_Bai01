package presentation;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student = new Student();
        String name = student.inputName(sc);
        int age = student.inputNumber(sc);
        double avgScore = student.inputAvg(sc);
        Student student1 = new Student(name, age, avgScore);
        students.add(student1);
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

