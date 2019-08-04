package com.imooc.school;

public class Student extends People {

    private String studentNo;
    private String studentMajor;
    private int studentDuration;

    public Student(){
        super();
    }

    public Student(String name, String studentNo, String sex, int age,
                   String studentMajor, int studentDuration){

        super(name, sex, age);
        this.setStudentMajor(studentMajor);
        this.setStudentDuration(studentDuration);
        this.setStudentNo(studentNo);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int getStudentDuration() {
        return studentDuration;
    }

    public void setStudentDuration(int studentDuration) {
        this.studentDuration = studentDuration;
    }

    public void getStudentInformation(){
        System.out.println("The student information shows as follwing:");
        System.out.println("Name: " + this.name);
        System.out.println("Student No: " + this.studentNo);
        System.out.println("Sex: " + this.sex);
        System.out.println("Age: " + this.age);
        System.out.println("Major: " + this.studentMajor);
        System.out.println("Duration: " + this.studentDuration);
        System.out.println("==========================================");
    }
}
