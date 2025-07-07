package entity;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double avgScore;

    public Student() {
    }

    public Student(String name, int age, double avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public void inputData (Scanner sc) {
        this.name = inputName(sc);
        this.age = inputNumber(sc);
        this.avgScore = inputAvg(sc);

    }
    public String inputName (Scanner sc) {
        System.out.println("Nhập vào tên: ");
        do {
            String name = sc.nextLine();
            if(name.isBlank()) {
                System.err.println("Vui lòng không được bỏ trống");
            }else{
                return name;
            }
        }while (true);
    }
    public int inputNumber(Scanner sc) {
        System.out.println("Nhập vào tuổi sinh viên:");
        do {
            try{
                int number = Integer.parseInt(sc.nextLine());
                if(number>0){
                    return number;
                }
                System.err.println("Vui lòng nhập số lớn hơn 0");
            }
            catch (Exception e){
                System.err.println("Vui lòng nhập số");
            }
        }while (true);
    }
    public double inputAvg(Scanner sc) {
        System.out.println("Nhập vào điểm trung  bình: ");
        do{
            try{
            double avgScore =sc.nextDouble();
            if(avgScore>0 && avgScore<=10){
                return avgScore;
            }else {
                System.err.println("Vui lòng nhập điểm trung  bình từ 1-10");}
            }catch (Exception e){
                System.err.println("Vui lòng nhập vào 1 số");
            }
        }while (true);
    }
    @Override
    public String toString() {
        return "Tên: "+name+ ", tuổi: "+age+ ", điểm trung bình: "+avgScore;
    }
}
