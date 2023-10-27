package com.sias.Guo;

/**
 * @Author:XQ
 * @Date:
 */
import java.util.Scanner;

public class Student {
    private String name;
    private String gender;
    private boolean isMonitor;
    private double mathScore;
    private double chineseScore;
    private double englishScore;

    public Student(String name, String gender, boolean isMonitor) {
        this.name = name;
        this.gender = gender;
        this.isMonitor = isMonitor;
    }

    public double getTotalScore() {
        return mathScore + chineseScore + englishScore;
    }

    public double getAverageScore() {
        return getTotalScore() / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生姓名：");
        String name = scanner.nextLine();

        System.out.print("请输入学生性别：");
        String gender = scanner.nextLine();

        System.out.print("请输入学生是否为班干部（是/否）：");
        boolean isMonitor = scanner.nextLine().equals("是");

        System.out.print("请输入数学成绩：");
        double mathScore = scanner.nextDouble();

        System.out.print("请输入语文成绩：");
        double chineseScore = scanner.nextDouble();

        System.out.print("请输入外语成绩：");
        double englishScore = scanner.nextDouble();

        Student student = new Student(name, gender, isMonitor);
        student.mathScore = mathScore;
        student.chineseScore = chineseScore;
        student.englishScore = englishScore;

        System.out.println("总分：" + student.getTotalScore());
        System.out.println("平均分：" + student.getAverageScore());

        scanner.close();
    }
}

