package com.sias.Guo;

/**
 * @Author:XQ
 * @Date:
 */
public class Student1 {
    String name;
    int age;
    public Student1(){
        System.out.println("Student1()构造方法被调用");
    }
    public Student1(String name){
        this.name = name;
        System.out.println("Student(String name)构造方法被调用");
    }
    public Student1(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Student1(String name,int age)构造方法被调用");
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("张三");
        Student1 s3 = new Student1("李四",15);
    }
}
