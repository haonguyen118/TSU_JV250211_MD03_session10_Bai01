package presentation;

import entity.Student;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();


        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("******QUẢN LÝ SINH VIÊN******\n" +
                    "1.Thêm sinh viên\n" +
                    "2. Hiển thị danh sách sinh viên.\n" +
                    "3. THoát.\n" +
                    "Nhập lựa chọn của bạn.\n");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-3");
            }
        } while (true);
    }
}