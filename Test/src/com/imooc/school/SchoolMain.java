package com.imooc.school;

public class SchoolMain {
    public static void main(String[] Args){
        Major m = new Major();
        Student s2 = new Student("No3","S01","male",18,
                "Computer Science",4);
        Student s1 = new Student("No4","S02","female",17,
                "Computer Science",4);
        Student s3 = new Student("No5","S03","male",18,
                "Computer Science",4);
        m.getMajorInformation();
        s1.getStudentInformation();
        s2.getStudentInformation();
        s3.getStudentInformation();
    }
}
